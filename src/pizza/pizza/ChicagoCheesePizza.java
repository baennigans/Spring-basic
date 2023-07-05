package pizza.pizza;

public class ChicagoCheesePizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("1. Chicago CheesePizza prepare..");
	}

	@Override
	public void bake() {
		System.out.println("2. Chicago CheesePizza bake..");
	}

	@Override
	public void cut() {
		System.out.println("3. Chicago CheesePizza cut..");
	}

	@Override
	public void box() {
		System.out.println("4. Chicago CheesePizza box..");
	}

	@Override
	public void name() {
		System.out.println("-------------------------------");
		System.out.println("ORDER NAME : Chicago CheesePizza");
	}

}
