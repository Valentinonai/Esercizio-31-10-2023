package Esercizio31102023.Esercizio31102023.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Getter
@PropertySource("application.properties")
@Component("table1")
public class Table {

    private int numTable;
    private int numMaxCoperti;
    private int numeroCoperti;
    private boolean isFree;
    @Value("${table.pax}")
    private int pax;

    public Table(@Value("1") int numTable, @Value("5") int numMaxCoperti,@Value("3") int numeroCoperti,@Value("false") boolean isFree) {
        this.numTable = numTable;
        this.numMaxCoperti = numMaxCoperti;
        this.numeroCoperti = numeroCoperti;
        this.isFree = isFree;
    }

    public int copertoTot(){
        return this.pax*this.numeroCoperti;
    }

    public void print(){
        System.out.println("numero tavolo--> "+numTable);
        System.out.println("numero massimo coperti--> "+numMaxCoperti);
        System.out.println("numero coperti--> "+numeroCoperti);
        System.out.println("occupato/libero--> "+(this.isFree?"Libero":"Occupato"));
        System.out.println("prezzo totale coperto--> "+copertoTot());
    }

}
