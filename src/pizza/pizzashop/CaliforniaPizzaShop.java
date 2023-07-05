package pizza.pizzashop;

public class CaliforniaPizzaShop extends PizzaShop {

	@Override
	public void orderPizza() {
		System.out.println("<< California PizzaShop >>");
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
