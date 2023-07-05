package pizza.pizzashop;

public class ChicagoPizzaShop extends PizzaShop {

	@Override
	public void createPizza() {
		System.out.println("<< Chicago PizzaShop >>");
	}

	@Override
	public void orderPizza() {
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}

}
