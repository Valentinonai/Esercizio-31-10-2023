package Esercizio31102023.Esercizio31102023;

import Esercizio31102023.Esercizio31102023.entities.Menu;
import Esercizio31102023.Esercizio31102023.entities.Order;
import Esercizio31102023.Esercizio31102023.entities.Table;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@Slf4j
public class Esercizio31102023Application {

	public static void main(String[] args) {
		SpringApplication.run(Esercizio31102023Application.class, args);

		AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(Esercizio31102023Application.class);

		Menu m= (Menu) ctx.getBean("menu");
//		Il metodo seguente va bene solo se c'è un unico bean il metodo sopra è più specifico
//		Menu m= (Menu) ctx.getBean(Menu.class);


		log.info(String.valueOf(m));

		Order order1 = (Order) ctx.getBean("order1");
		Order order2 = (Order) ctx.getBean("order2");
		order1.print();
		order2.print();
		Table table1=(Table) ctx.getBean("table1");
		table1.print();;
		ctx.close();
	}

}
