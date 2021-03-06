package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
// ApplicationContext�� ��ü�� �����ϴ� ���
public class MyBeanTest_ApplicationContext {
	public static void main(String[] args) {
		System.out.println("****************ApplicationContext������**************");
		ApplicationContext factory = 
				new GenericXmlApplicationContext("/config/bean.xml");
		// ȣ������ A, B �� �����.
		System.out.println("****************getBeanȣ����**************");
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("myBean1"); 
		run(obj);
		show(obj);
		
	}
	public static void run(MyBeanStyle obj) {
		System.out.println("************************");
		obj.hello("����");
		obj.hello("����");
		System.out.println("************************");
	}

	public static void show(MyBeanStyle obj) {
		System.out.println("========================");
		obj.hello("����");
		obj.hello("����");
		System.out.println("========================");
	}
	
}
