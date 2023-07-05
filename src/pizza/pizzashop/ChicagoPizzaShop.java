package pizza.pizzashop;

public class ChicagoPizzaShop extends PizzaShop {

	@Override
	public void createPizza() {
		System.out.println("<< Chicago PizzaShop >>");
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
