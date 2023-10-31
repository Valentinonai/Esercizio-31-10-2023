package Esercizio31102023.Esercizio31102023.command_line_runner;

import Esercizio31102023.Esercizio31102023.Esercizio31102023Application;
import Esercizio31102023.Esercizio31102023.entities.Menu;
import Esercizio31102023.Esercizio31102023.entities.Table;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
@Slf4j
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception{
        AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(Esercizio31102023Application.class);

        Menu m= (Menu) ctx.getBean("menu");
//		Il metodo seguente va bene solo se c'è un unico bean il metodo sopra è più specifico
//		Menu m= (Menu) ctx.getBean(Menu.class);


        log.info(String.valueOf(m));

        Esercizio31102023.Esercizio31102023.entities.Order order1 = (Esercizio31102023.Esercizio31102023.entities.Order) ctx.getBean("order1");
        Esercizio31102023.Esercizio31102023.entities.Order order2 = (Esercizio31102023.Esercizio31102023.entities.Order) ctx.getBean("order2");
        order1.print();
        order2.print();
        Table table1=(Table) ctx.getBean("table1");
        table1.print();;
        ctx.close();
    }
}
