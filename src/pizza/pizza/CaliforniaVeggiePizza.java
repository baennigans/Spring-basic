package pizza.pizza;

public class CaliforniaVeggiePizza extends Pizza {

	@Override
	public void name() {
		System.out.println("ORDER NAME : California VeggiePizza");
		System.out.println("-------------------------------");
	}

	@Override
	public void prepare() {
		System.out.println("1. California VeggiePizza prepare..");
	}

	@Override
	public void bake() {
		System.out.println("2. California VeggiePizza bake..");
	}

	@Override
	public void cut() {
		System.out.println("3. California VeggiePizza cut..");
	}

	@Override
	public void box() {
		System.out.println("4. California VeggiePizza box..");
	}
	
}
