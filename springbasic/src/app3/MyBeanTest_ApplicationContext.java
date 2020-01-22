package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
// ApplicationContext가 객체를 관리하는 방법
public class MyBeanTest_ApplicationContext {
	public static void main(String[] args) {
		System.out.println("****************ApplicationContext생성전**************");
		ApplicationContext factory = 
				new GenericXmlApplicationContext("/config/bean.xml");
		// 호출전에 A, B 다 만든다.
		System.out.println("****************getBean호출전**************");
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("myBean1"); 
		run(obj);
		show(obj);
		
	}
	public static void run(MyBeanStyle obj) {
		System.out.println("************************");
		obj.hello("현빈");
		obj.hello("현빈");
		System.out.println("************************");
	}

	public static void show(MyBeanStyle obj) {
		System.out.println("========================");
		obj.hello("현빈");
		obj.hello("현빈");
		System.out.println("========================");
	}
	
}
