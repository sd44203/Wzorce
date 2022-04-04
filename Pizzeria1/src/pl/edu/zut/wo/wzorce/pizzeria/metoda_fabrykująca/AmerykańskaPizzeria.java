package pl.edu.zut.wo.wzorce.pizzeria.metoda_fabrykująca;

import pl.edu.zut.wo.wzorce.pizzeria.amerykańska.AmerykańskaOwoceMorzePizza;
import pl.edu.zut.wo.wzorce.pizzeria.amerykańska.AmerykańskaPepperoniPizza;
import pl.edu.zut.wo.wzorce.pizzeria.amerykańska.AmerykańskaSerowaPizza;
import pl.edu.zut.wo.wzorce.pizzeria.amerykańska.AmerykańskaWegetariańskaPizza;
import pl.edu.zut.wo.wzorce.pizzeria.pizza.Pizza;
import pl.edu.zut.wo.wzorce.pizzeria.włoska.WłoskaOwoceMorzaPizza;
import pl.edu.zut.wo.wzorce.pizzeria.włoska.WłoskaPepperoniPizza;
import pl.edu.zut.wo.wzorce.pizzeria.włoska.WłoskaSerowaPizza;
import pl.edu.zut.wo.wzorce.pizzeria.włoska.WłoskaWegetariańskaPizza;

public class AmerykańskaPizzeria extends Pizzeria{
    @Override
    public Pizza utwórzPizza(String typ) {
        Pizza pizza = null;
        if (typ.equals("serowa")) {
            pizza = new AmerykańskaSerowaPizza();
        } else if (typ.equals("pepperoni")) {
            pizza = new AmerykańskaPepperoniPizza();
        } else if (typ.equals("owocemorza")) {
            pizza = new AmerykańskaOwoceMorzePizza();
        } else if (typ.equals("wegetariańska")) {
            pizza = new AmerykańskaWegetariańskaPizza();
        }

        return pizza;
    }
}
