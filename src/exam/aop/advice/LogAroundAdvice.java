package exam.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		//�ΰ�����(�ð�����)
		long start = System.currentTimeMillis();
		
		//�־��� �θ���
		Object result = invocation.proceed();
		
		//�ΰ�����(�ð�����)
		long end = System.currentTimeMillis();
		
		String message = (end - start)+"ms �ɷȽ��ϴ�.";
		System.out.println(message);
		
		return result;
	}

}
