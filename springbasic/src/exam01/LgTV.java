package exam01;

public class LgTV implements TV {
	public void turnOn() {
		System.out.println("LgTV---���� �Ҵ�.");
	}

	public void turnOff() {
		System.out.println("LgTV---���� ����.");
	}

	@Override
	public void volumeUp() {
		System.out.println("LgTV---�Ҹ� �ø���.");
	}

	@Override
	public void volumeDown() {
		System.out.println("LgTV---�Ҹ� ������.");
	}
}
