package Esercizio31102023.Esercizio31102023.entities;

import Esercizio31102023.Esercizio31102023.Esercizio31102023Application;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Configuration
@Slf4j
@PropertySource("application.properties")
public class AppConfig {
    @Value("${table.pax}")
    private int p;
   @Bean(name = "toppings_tomato")
    public Topping toppingTomatoBean(){
       return new Topping("tomato",0,0);
   }
   @Bean(name = "toppings_cheese")
    public Topping toppingCheeseBean(){
       return new Topping("cheese",92,0.69);
   }
   @Bean(name = "toppings_ham")
    public Topping toppingHamBean(){
       return new Topping("Ham",35,0.99);
   }
   @Bean(name = "toppings_pineapple")
    public Topping toppingPineappleBean(){
       return new Topping("pineapple",24,0.79);
   }
   @Bean(name = "toppings_salami")
    public Topping toppingSalamiBean(){
       return new Topping("salami",86,0.99);
   }


   @Bean(name = "pizza_margherita")
    public Pizza pizzaMargheritaBean(){
       List<Topping> tList = new ArrayList<>();
       tList.add(toppingTomatoBean());
       tList.add(toppingCheeseBean());
       return new Pizza("Pizza Margherita",tList,false);
   }
   @Bean(name = "hawaiian_pizza")
    public Pizza pizzaHawaiianBean(){
       List<Topping> tList = new ArrayList<>();
       tList.add(toppingTomatoBean());
       tList.add(toppingCheeseBean());
       tList.add(toppingHamBean());
       tList.add(toppingPineappleBean());
       return new Pizza("Hawaiian Pizza",tList,false);
   }
    @Bean(name = "salami_pizza")
    public Pizza pizzaSalamiBean(){
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        tList.add(toppingSalamiBean());
        return new Pizza("Salami Pizza",tList,false);
    }

    @Bean(name = "salami_pizza_xl")
    public Pizza pizzaSalamiXlBean(){
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        tList.add(toppingSalamiBean());
        return new Pizza("Salami Pizza",tList,true);
    }

    @Bean(name = "lemonade")
    public Drink lemonadeBean(){
       return new Drink("Lemonade",128,1.29);
    }
    @Bean(name = "water")
    public Drink waterBean(){
        return new Drink("Water",0,1.29);
    }
    @Bean(name = "wine")
    public Drink wineBean(){
        return new Drink("Wine",607,7.49);
    }

    @Bean(name = "menu")
    public Menu menuBean(){
       List<Pizza> pizzaList=new ArrayList<>();
       List<Drink> drinkList=new ArrayList<>();

       pizzaList.add(pizzaMargheritaBean());
       pizzaList.add(pizzaHawaiianBean());
       pizzaList.add(pizzaSalamiBean());
       pizzaList.add(pizzaSalamiXlBean());

       drinkList.add(lemonadeBean());
       drinkList.add(waterBean());
       drinkList.add(wineBean());

       return new Menu(pizzaList,drinkList);
    }


    @Bean(name="order1")
    public Order creaOrdine1(){
       List<Item> l=new ArrayList<>();
       l.add(pizzaHawaiianBean());
       l.add(pizzaHawaiianBean());
       l.add(pizzaMargheritaBean());
       l.add(lemonadeBean());
       return new Order(1,3,l);

    }
    @Bean(name="order2")
    public Order creaOrdine2(){
       List<Item> l=new ArrayList<>();
       l.add(pizzaMargheritaBean());
       l.add(pizzaSalamiXlBean());
       l.add(lemonadeBean());
       l.add(waterBean());
       return new Order(1,3,l);

    }

   @Bean(name="table1")
   public Table creaTable1(){
      return new Table(1,5,3,false,this.p);
   }

}
