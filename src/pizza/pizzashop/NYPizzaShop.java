package pizza.pizzashop;

public class NYPizzaShop extends PizzaShop {
	
	@Override
	public void createPizza() {
		System.out.println("<< NY Pizzashop. >>");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}

	@Override
	public void orderPizza() {
		pizza.name();
	}
	
}
