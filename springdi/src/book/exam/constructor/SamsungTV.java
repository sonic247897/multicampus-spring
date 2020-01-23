package book.exam.constructor;

public class SamsungTV implements TV{
	// has-a관계
	// 현재 클래스 내부에서 사용하는 객체 - 스프링 컨테이너를 통해 전달받을 수 있도록 준비
	Speaker s;
	
	public SamsungTV(Speaker s) {
		super();
		this.s = s;
	}
	
	@Override
	public void turnOn() {
		System.out.println("SamsungTV---전원 켠다.");
	}
	@Override
	public void turnOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}

	public void volumeUp() {
		// 원래 하던 방식: 원하는 곳에서 생성하고 메소드 호출
		//SonySpeaker speaker = new SonySpeaker();
		System.out.println("SamsungTV---소리 올린다.");
		//speaker.volumeUp();
		s.volumeUp();
	}
	
	public void volumeDown() {
		//SonySpeaker speaker = new SonySpeaker();
		System.out.println("SamsungTV---소리 내린다.");
		//speaker.volumeDown();
		s.volumeDown();
	}

}
