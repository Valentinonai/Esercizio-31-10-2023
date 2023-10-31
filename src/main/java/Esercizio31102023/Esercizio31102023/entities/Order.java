package Esercizio31102023.Esercizio31102023.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.List;
import java.util.Random;

@Getter

@Slf4j

public class Order {
    private int numeroOrdine;
    private State state;
    private int numCoperti;
    private LocalTime oraAcquisizione;
    private double price;
   private List<Item> ordiniList;

    public Order(int numOrdine,int numCoperti,List<Item> ordiniList){
        this.numeroOrdine=numOrdine;
        this.state=statoOrdine();
        this.numCoperti=numCoperti;
        this.oraAcquisizione=LocalTime.now();
        this.ordiniList=ordiniList;
        this.price=prezzoOrdine(ordiniList);

    }


    public static State statoOrdine(){
        Random rnd=new Random();
        int x=rnd.nextInt(0,3);
        return (x==0?State.IN_CORSO:x==1?State.PRONTO:State.SERVITO);
    }
    public static double prezzoOrdine(List<Item> l){
        double tot=0;
      for(int i=0;i<l.size();i++){
          tot+=l.get(i).getPrice();
      }
      return tot;
    }
    public void print(){
        System.out.println("id ordine--> "+this.numeroOrdine );
        System.out.println("stato--> "+this.state );
        System.out.println("numero coperti--> "+this.numCoperti );
        System.out.println("ora acquisizione--> "+this.oraAcquisizione);
        System.out.println("prezzo--> "+this.price);
        System.out.println("Lista: ");
       this.ordiniList.forEach(elem-> System.out.println(elem.toString()));

    }
}
