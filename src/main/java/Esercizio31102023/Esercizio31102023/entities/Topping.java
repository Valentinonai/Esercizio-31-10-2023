package Esercizio31102023.Esercizio31102023.entities;

import lombok.*;

import java.util.List;

@Getter
@Setter

public class Topping extends Item {
    private String name;

    public Topping(String name,int calories, double price ) {
        super(calories, price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
