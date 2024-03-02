package edu.iu.habahram.pizzashop.model;

public class NewYorkStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        PizzaFactory pizzaFactory = new NewYorkPizzaFactory();
        return pizzaFactory.createPizza(item);
    }
}
