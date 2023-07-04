package duck.quack;

public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("QUACK = quack!");
	}

}
