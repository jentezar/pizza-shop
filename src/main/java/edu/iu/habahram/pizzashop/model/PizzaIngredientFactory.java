package edu.iu.habahram.pizzashop.model;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Veggies[] createNYVeggies();
	public Clams createNYClam();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
