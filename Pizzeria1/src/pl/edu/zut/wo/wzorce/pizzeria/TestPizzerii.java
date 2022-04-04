package pl.edu.zut.wo.wzorce.pizzeria;

import pl.edu.zut.wo.wzorce.pizzeria.metoda_fabrykująca.Pizzeria;
import pl.edu.zut.wo.wzorce.pizzeria.metoda_fabrykująca.WłoskaPizzeria;
import pl.edu.zut.wo.wzorce.pizzeria.pizza.Pizza;

public class TestPizzerii {

	public static void main(String[] args) {
//		Pizzeria pizzeria = new Pizzeria();
//		Pizza pizza = pizzeria.zamówPizza("serowa");
//		System.out.println(pizzeria.getClass().getSimpleName() + " wyprodukowała " + pizza.getClass().getSimpleName());
		Pizzeria pizzeria = new WłoskaPizzeria();
		Pizza pizzaWłoska = pizzeria.zamówPizza("serowa");
		System.out.println(pizzeria.getClass().getSimpleName() + " wyprodukowała " + pizzaWłoska.getClass().getSimpleName());

	}
}
