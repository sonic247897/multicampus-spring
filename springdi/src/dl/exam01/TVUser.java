package dl.exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		/*
		 * ������ �����̳ʿ� ���� �����ؼ� ��ü�� ���޹޾� ����� �� �ֵ��� �����ϱ�
		 * Dependency Lookup ����
		 * ��������: config/bean.xml
		 * �� ���: 
		 * 		SamsungTV => samsung
		 * 		LgTV => lg
		 * 	
		 * getBean���� ���ͼ� �۾��ϵ��� �ڵ� �����ϱ� 
		 */
		// API�� new�� ����ؾ� �Ѵ�.
		ApplicationContext factory = 
				new GenericXmlApplicationContext("/config/bean.xml");
		
		// @ OOP�� ���缭 �����ؾ� �ڵ� ���� ���� ���� ���� 
		//TV tv = (TV)factory.getBean("samsung");
		//TV tv = factory.getBean("samsung", TV.class);
		TV tv = factory.getBean("tv", TV.class);
		tv.turnOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.turnOff();
		
		/*TV lgtv = (TV)factory.getBean("lg"); 
		lgtv.turnOn();
		lgtv.volumeUp();
		lgtv.volumeDown();
		lgtv.turnOff();*/
	}

}
