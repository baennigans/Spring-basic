package duck.ui;

import duck.fly.FlyWithWings;
import duck.quack.MuteQuack;

public class DecoyDuck implements Duck {

	MuteQuack quack;
	FlyWithWings fly;
	
	
	public void setQuack(MuteQuack quack) {
		this.quack = quack;
	}

	public void setFly(FlyWithWings fly) {
		this.fly = fly;
	}
	
	@Override
	public void displayName() {
		System.out.println("NAME = DecoyDuck!!");	
	}

	@Override
	public void performQuack() {
		quack.quack();
	}

	@Override
	public void performFly() {
		fly.fly();
	}
}
