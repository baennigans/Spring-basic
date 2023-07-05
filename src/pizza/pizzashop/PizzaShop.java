package pizza.pizzashop;

import pizza.pizza.Pizza;

public abstract class PizzaShop {

	Pizza pizza;
	
	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public abstract void orderPizza();
	public abstract void createPizza();
	
}
