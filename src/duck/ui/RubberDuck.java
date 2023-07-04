package duck.ui;

import duck.fly.FlyNoWay;
import duck.quack.Squeak;

public class RubberDuck implements Duck {

	Squeak quack;
	FlyNoWay fly;
	
	
	public void setQuack(Squeak quack) {
		this.quack = quack;
	}

	public void setFly(FlyNoWay fly) {
		this.fly = fly;
	}
	
	@Override
	public void displayName() {
		System.out.println("NAME = RubberDuck!!");
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
