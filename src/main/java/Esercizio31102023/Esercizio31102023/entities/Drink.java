package Esercizio31102023.Esercizio31102023.entities;

import lombok.*;

@Getter
@Setter

public class Drink extends Item {
    private String name;

    public Drink( String name,int calories, double price) {
        super(calories, price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
