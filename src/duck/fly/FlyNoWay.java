package duck.fly;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("FLY = fly no way..");
	}

}
