package pizza.pizzashop;

public class CaliforniaPizzaShop extends PizzaShop {

	@Override
	public void createPizza() {
		System.out.println("<< California PizzaShop >>");
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
