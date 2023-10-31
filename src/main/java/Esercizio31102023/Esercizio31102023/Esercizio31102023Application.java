package Esercizio31102023.Esercizio31102023;

import Esercizio31102023.Esercizio31102023.entities.Menu;
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
		ctx.close();
	}

}
