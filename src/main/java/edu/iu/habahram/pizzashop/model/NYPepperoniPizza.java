package edu.iu.habahram.pizzashop.model;

public class NYPepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public NYPepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createNYVeggies();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
