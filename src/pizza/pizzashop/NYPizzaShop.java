package pizza.pizzashop;

public class NYPizzaShop extends PizzaShop {
	
	@Override
	public void orderPizza() {
		System.out.println("<< NY Pizzashop. >>");
		pizza.name();
	}
	
	@Override
	public void createPizza() {
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}
}
