package app3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyBeanTest4 {
	public static void main(String[] args) {
		// ApplicationContext(인터페이스)의 하위 인터페이스or추상클래스
		// 	=>기능이 더 많다.
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("/config/bean.xml");
		// 기본설정이 singleton이므로 getBean을 세 번 호출해도 
		// MyBeanStyleB객체는 한 개만 생성되어 호출된다.
		// 따라서 init도 한 번 호출된다.
		MyBeanStyle obj1 = (MyBeanStyle)factory.getBean("myBean2"); 
		MyBeanStyle obj2 = (MyBeanStyle)factory.getBean("myBean2"); 
		MyBeanStyle obj3 = (MyBeanStyle)factory.getBean("myBean2"); 
		run(obj1);
		show(obj1);
		
		//컨테이너에 의해 생성된 객체가 소멸되는 시점은 컨테이너가 소멸될 때이다.
		// 서블릿 같은 lifecycle을 만들 때 필요한 내용
		factory.close();
		
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
