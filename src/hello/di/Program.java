package hello.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import hello.di.ui.HelloWorld;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("hello/di/setting.xml");
		HelloWorld helloWorld = context.getBean(HelloWorld.class);
		
		helloWorld.sayHello();
	}
}