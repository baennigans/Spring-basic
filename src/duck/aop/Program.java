package duck.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import duck.ui.Duck;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("duck/aop/duck.xml");
		Duck duck = context.getBean("duck", Duck.class);

		duck.displayName();
		duck.performQuack();
		duck.performFly();
	}
}
