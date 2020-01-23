package di.setter.basic;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("config/setter.xml");
		/*MemberDAO dao = new MemberDAO();
		Insa insa = new InsaImpl(dao);*/
		Insa insa = factory.getBean("insa", Insa.class);
		MemberDTO user = new MemberDTO("jang","1234","¿Âµø∞«");
		insa.addUser(user);

	}

}
