package app3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
// BeanFactory ����ؼ� �۾��ϱ�
// 1. xml�� spring���� ����� �� �ֵ��� ��ü�� ��ȯ�ϴ� �۾��� �����ϴ� ��ü����
//		-> ClassPathResource�� xml������ classpath(src)���� ã�´�.
// 2. �����̳� ��ü�� ����
public class MyBeanTest2 {
	public static void main(String[] args) {
		// 1. xml�Ľ� - classpath(src)�������� ã�� ������ ���x
		Resource res = new ClassPathResource("/config/bean.xml");
		// 2. �����̳ʰ�ü�� ���� - �����丮 �迭
		// ���ο� xml�� �����ִ� ���ҽ� ��ü�� �ʿ��ϴ�. ���ҽ��� xml�� �̸� �м��ؼ� ���� ����
		BeanFactory factory = new XmlBeanFactory(res);
		// 3. �����̳ʰ� �����ϴ� ��ü�� ���޹ޱ�
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("myBean"); 
		
		// �����Ͻ� ���� ȣ��
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
