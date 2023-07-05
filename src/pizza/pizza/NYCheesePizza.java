package pizza.pizza;

public class NYCheesePizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("1. NY CheesePizza prepare..");
	}

	@Override
	public void bake() {
		System.out.println("2. NY CheesePizza bake..");
	}

	@Override
	public void cut() {
		System.out.println("3. NY CheesePizza cut..");
	}

	@Override
	public void box() {
		System.out.println("4. NY CheesePizza box..");
	}

}
