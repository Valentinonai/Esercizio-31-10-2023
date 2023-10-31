package Esercizio31102023.Esercizio31102023.entities;

import lombok.*;

import java.util.List;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    private List <Pizza> pizzaList;
    private List<Drink> drinkList;
}
