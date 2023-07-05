package pizza.pizzashop;

public class ChicagoPizzaShop extends PizzaShop {

	@Override
	public void orderPizza() {
		System.out.println("<< Chicago PizzaShop >>");
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
