package di.constructor03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext factory = 
				new GenericXmlApplicationContext("config/bean.xml");
		IWriteArticleMgr myWrite = factory.getBean("mgr", IWriteArticleMgr.class);
		// TestMain에서 사용 안하므로 바로 생성하면서 전달
		myWrite.write(new ArticleDTO());
	}

}
