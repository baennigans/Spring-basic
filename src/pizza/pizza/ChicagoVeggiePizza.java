package pizza.pizza;

public class ChicagoVeggiePizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("1. Chicago VeggiePizza prepare..");
	}

	@Override
	public void bake() {
		System.out.println("2. Chicago VeggiePizza bake..");
	}

	@Override
	public void cut() {
		System.out.println("3. Chicago VeggiePizza cut..");
	}

	@Override
	public void box() {
		System.out.println("4. Chicago VeggiePizza box..");
	}

	@Override
	public void name() {
		System.out.println("-------------------------------");
		System.out.println("ORDER NAME : Chicago VeggiePizza");
	}

}
