package pizza;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pizza.pizzashop.PizzaShop;

public class PizzaMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("pizza/pizza.xml");
		
		PizzaShop pizzaShop = context.getBean("pizzaShop", PizzaShop.class);
		
		pizzaShop.orderPizza();		
		pizzaShop.createPizza();
		
	}
}