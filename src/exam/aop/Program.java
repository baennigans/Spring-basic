package exam.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import exam.aop.ui.DisplayExam;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("exam/aop/setting.xml");
//		Exam exam = context.getBean("exam", Exam.class);
		DisplayExam displayExam = context.getBean("displayExam",DisplayExam.class);
		
		
//		System.out.println("total : "+exam.total());
//		System.out.println("average : "+exam.avg());
		
		displayExam.display();
	}
}