package di.setter01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
// Ȯ�尡�ɼ� -> �ǹ������� DTO ����(?) ����Ŭ������ ������ �����Ѵ�.
public class Test01 {
	public static void main(String[] args) {
		//Player p = new Player();
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("config/setter.xml");
		// ����Ÿ������ �޾ƾ� �ٸ�Ÿ�Ե� ���� �� �ִ� - ������
		AbstractPlayer p = factory.getBean("player", AbstractPlayer.class);
		p.play();
		System.out.println("���� ���� �ֻ����� ��:"+p.getTotalValue());
	}

}
