package pizza.pizza;

public class NYVeggiePizza extends Pizza{

	@Override
	public void prepare() {
		System.out.println("1. NY VeggiePizza prepare..");
	}

	@Override
	public void bake() {
		System.out.println("2. NY VeggiePizza bake..");
	}

	@Override
	public void cut() {
		System.out.println("3. NY VeggiePizza cut..");
	}

	@Override
	public void box() {
		System.out.println("4. NY VeggiePizza box..");
	}

	@Override
	public void name() {
		System.out.println("NAME : NY VeggiePizza");
	}

}
