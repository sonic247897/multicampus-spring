package exam01;

public class TVUser {
	public static void main(String[] args) {
		TV tv = new SamsungTV();
		tv.turnOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.turnOff();
		
		TV lgtv = new LgTV();
		lgtv.turnOn();
		lgtv.volumeUp();
		lgtv.volumeDown();
		lgtv.turnOff();
	}

}
