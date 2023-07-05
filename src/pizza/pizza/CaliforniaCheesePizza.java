package pizza.pizza;

public class CaliforniaCheesePizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("1. California CheesePizza prepare..");
	}

	@Override
	public void bake() {
		System.out.println("2. California CheesePizza bake..");
	}

	@Override
	public void cut() {
		System.out.println("3. California CheesePizza cut..");
	}

	@Override
	public void box() {
		System.out.println("4. California CheesePizza box..");
	}

	@Override
	public void name() {
		System.out.println("NAME : California CheesePizza");
	}

}
