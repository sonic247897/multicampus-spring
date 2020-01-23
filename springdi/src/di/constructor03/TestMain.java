package di.constructor03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext factory = 
				new GenericXmlApplicationContext("config/bean.xml");
		IWriteArticleMgr myWrite = factory.getBean("mgr", IWriteArticleMgr.class);
		// TestMain���� ��� ���ϹǷ� �ٷ� �����ϸ鼭 ����
		myWrite.write(new ArticleDTO());
	}

}
