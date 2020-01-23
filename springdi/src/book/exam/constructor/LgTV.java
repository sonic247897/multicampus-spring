package book.exam.constructor;

public class LgTV implements TV {
	Speaker s;
	
	public LgTV(Speaker s) {
		super();
		this.s = s;
	}
	
	public void turnOn() {
		System.out.println("LgTV---전원 켠다.");
	}

	public void turnOff() {
		System.out.println("LgTV---전원 끈다.");
	}

	@Override
	public void volumeUp() {
		System.out.println("LgTV---소리 올린다.");
		s.volumeUp();
	}

	@Override
	public void volumeDown() {
		System.out.println("LgTV---소리 내린다.");
		s.volumeDown();
	}
}
