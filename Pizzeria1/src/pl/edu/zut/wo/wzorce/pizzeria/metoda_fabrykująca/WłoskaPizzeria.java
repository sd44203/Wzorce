package pl.edu.zut.wo.wzorce.pizzeria.metoda_fabrykująca;

import pl.edu.zut.wo.wzorce.pizzeria.pizza.*;
import pl.edu.zut.wo.wzorce.pizzeria.włoska.WłoskaOwoceMorzaPizza;
import pl.edu.zut.wo.wzorce.pizzeria.włoska.WłoskaPepperoniPizza;
import pl.edu.zut.wo.wzorce.pizzeria.włoska.WłoskaSerowaPizza;
import pl.edu.zut.wo.wzorce.pizzeria.włoska.WłoskaWegetariańskaPizza;

public class WłoskaPizzeria extends Pizzeria {

    @Override
    public Pizza utwórzPizza(String typ) {
        Pizza pizza = null;
        if (typ.equals("serowa")) {
            pizza = new WłoskaSerowaPizza();
        } else if (typ.equals("pepperoni")) {
            pizza = new WłoskaPepperoniPizza();
        } else if (typ.equals("owocemorza")) {
            pizza = new WłoskaOwoceMorzaPizza();
        } else if (typ.equals("wegetariańska")) {
            pizza = new WłoskaWegetariańskaPizza();
        }
        return pizza;
    }
}
