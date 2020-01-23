package book.exam.constructor;

public class LgTV implements TV {
	Speaker s;
	
	public LgTV(Speaker s) {
		super();
		this.s = s;
	}
	
	public void turnOn() {
		System.out.println("LgTV---���� �Ҵ�.");
	}

	public void turnOff() {
		System.out.println("LgTV---���� ����.");
	}

	@Override
	public void volumeUp() {
		System.out.println("LgTV---�Ҹ� �ø���.");
		s.volumeUp();
	}

	@Override
	public void volumeDown() {
		System.out.println("LgTV---�Ҹ� ������.");
		s.volumeDown();
	}
}
