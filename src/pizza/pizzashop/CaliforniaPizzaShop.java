package pizza.pizzashop;

public class CaliforniaPizzaShop extends PizzaShop {

	@Override
	public void createPizza() {
		System.out.println("<< California PizzaShop >>");
	}

	@Override
	public void orderPizza() {
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}

}
