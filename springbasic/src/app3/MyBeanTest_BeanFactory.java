package app3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
// BeanFactory(컨테이너)가 객체를 관리하는 방법 - 언제 객체를 생성할까?

public class MyBeanTest_BeanFactory {
	public static void main(String[] args) {
		System.out.println("****************resource생성전**************");
		Resource res = new ClassPathResource("/config/bean.xml");
		System.out.println("****************BeanFactory생성전**************");
		BeanFactory factory = new XmlBeanFactory(res);
		System.out.println("****************getBean호출전**************");
		// getBean할 때 만들긴 하는데 기존에 있으면 객체 하나만 만든다.(싱글톤)
		// - 생성 한 번 하고 똑같은 객체 요청하면 가져다가 리턴한다.
		// ex. 서블릿
		// getBean으로 요청할 때 생성됨
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
