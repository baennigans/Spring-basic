package exam.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import exam.di.ui.DisplayExam;

public class Program {

	public static void main(String[] args) {
		
		// spring container
		
		ApplicationContext context = new ClassPathXmlApplicationContext("exam/di/setting.xml");
		DisplayExam displayExam = context.getBean(DisplayExam.class);
		
//		DisplayExam displayExam = (DisplayExam) context.getBean("display");

//		Exam exam = new AiswExam(10,10,10);
//		DisplayExam displayExam =
			// new InlineDisplayExam();
//			 new GridDisplayExam();
//		displayExam.setExam(exam);
		
		displayExam.display();
		
	}
}