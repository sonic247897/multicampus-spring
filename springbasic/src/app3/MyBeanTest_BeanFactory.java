package app3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
// BeanFactory(�����̳�)�� ��ü�� �����ϴ� ��� - ���� ��ü�� �����ұ�?

public class MyBeanTest_BeanFactory {
	public static void main(String[] args) {
		System.out.println("****************resource������**************");
		Resource res = new ClassPathResource("/config/bean.xml");
		System.out.println("****************BeanFactory������**************");
		BeanFactory factory = new XmlBeanFactory(res);
		System.out.println("****************getBeanȣ����**************");
		// getBean�� �� ����� �ϴµ� ������ ������ ��ü �ϳ��� �����.(�̱���)
		// - ���� �� �� �ϰ� �Ȱ��� ��ü ��û�ϸ� �����ٰ� �����Ѵ�.
		// ex. ����
		// getBean���� ��û�� �� ������
		MyBeanStyle obj1 = (MyBeanStyle)factory.getBean("myBean1"); 
		MyBeanStyle obj2 = (MyBeanStyle)factory.getBean("myBean1"); 
		if(obj1 == obj2) {
			System.out.println("����.");
		}else {
			System.out.println("�ٸ���.");
		}
		
		run(obj1);
		show(obj1);
		
		run(obj2);
		show(obj2);
		
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
