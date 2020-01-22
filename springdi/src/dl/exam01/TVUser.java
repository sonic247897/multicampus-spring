package dl.exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		/*
		 * 스프링 컨테이너에 의해 생성해서 객체를 전달받아 사용할 수 있도록 수정하기
		 * Dependency Lookup 적용
		 * 설정파일: config/bean.xml
		 * 빈 등록: 
		 * 		SamsungTV => samsung
		 * 		LgTV => lg
		 * 	
		 * getBean으로 얻어와서 작업하도록 코드 수정하기 
		 */
		// API의 new는 사용해야 한다.
		ApplicationContext factory = 
				new GenericXmlApplicationContext("/config/bean.xml");
		
		// @ OOP에 맞춰서 설계해야 코드 수정 없이 수정 가능 
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
