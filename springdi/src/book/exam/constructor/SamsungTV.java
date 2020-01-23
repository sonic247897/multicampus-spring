package book.exam.constructor;

public class SamsungTV implements TV{
	// has-a����
	// ���� Ŭ���� ���ο��� ����ϴ� ��ü - ������ �����̳ʸ� ���� ���޹��� �� �ֵ��� �غ�
	Speaker s;
	
	public SamsungTV(Speaker s) {
		super();
		this.s = s;
	}
	
	@Override
	public void turnOn() {
		System.out.println("SamsungTV---���� �Ҵ�.");
	}
	@Override
	public void turnOff() {
		System.out.println("SamsungTV---���� ����.");
	}

	public void volumeUp() {
		// ���� �ϴ� ���: ���ϴ� ������ �����ϰ� �޼ҵ� ȣ��
		//SonySpeaker speaker = new SonySpeaker();
		System.out.println("SamsungTV---�Ҹ� �ø���.");
		//speaker.volumeUp();
		s.volumeUp();
	}
	
	public void volumeDown() {
		//SonySpeaker speaker = new SonySpeaker();
		System.out.println("SamsungTV---�Ҹ� ������.");
		//speaker.volumeDown();
		s.volumeDown();
	}

}
