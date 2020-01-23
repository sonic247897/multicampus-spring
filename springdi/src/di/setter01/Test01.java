package di.setter01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
// 확장가능성 -> 실무에서는 DTO 빼고(?) 상위클래스를 무조건 정의한다.
public class Test01 {
	public static void main(String[] args) {
		//Player p = new Player();
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("config/setter.xml");
		// 상위타입으로 받아야 다른타입도 받을 수 있다 - 다형성
		AbstractPlayer p = factory.getBean("player", AbstractPlayer.class);
		p.play();
		System.out.println("세번 굴린 주사위의 합:"+p.getTotalValue());
	}

}
