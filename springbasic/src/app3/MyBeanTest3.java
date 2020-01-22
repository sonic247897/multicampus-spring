package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyBeanTest3 {
	public static void main(String[] args) {
		// ApplicationContext가 만들어질 때 xml을 읽어서 미리 빈을 만들기 때문에
		// 같은 빈 한 번 더 만들지 x (BeanFactory도 결과 같음: 싱글톤)
		ApplicationContext factory = 
				new GenericXmlApplicationContext("/config/bean.xml");
		// 같은 빈은 lookup 두 번하면 obj1과 obj2가 같을까?
		MyBeanStyle obj1 = (MyBeanStyle)factory.getBean("myBean1"); 
		MyBeanStyle obj2 = (MyBeanStyle)factory.getBean("myBean1"); 
		if(obj1 == obj2) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		run(obj1);
		show(obj1);
		
		run(obj2);
		show(obj2);
		
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
