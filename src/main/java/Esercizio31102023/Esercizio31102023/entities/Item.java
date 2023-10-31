package Esercizio31102023.Esercizio31102023.entities;

import lombok.Getter;
import lombok.ToString;

import java.util.List;
@Getter
public abstract class Item {

    protected int calories;
    protected double price;

    public Item(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }

}
