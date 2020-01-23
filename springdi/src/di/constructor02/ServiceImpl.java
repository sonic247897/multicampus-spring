package di.constructor02;

public class ServiceImpl implements Service {
	Logic mylogic;
	// String은 원래 설정파일에 명시하면 안되는 내용
	// (고정된 값이 아니라 클라이언트가 입력하는 값에 따라 달라지는 변수들)
	String name;
	String msg;
	
	public ServiceImpl(Logic mylogic, String name, String msg) {
		super();
		this.mylogic = mylogic;
		this.name = name;
		this.msg = msg;
		System.out.println("ServiceImpl의 매개변수 3개 생성자");
	}

	@Override
	public void test() {
		//Logic의 메소드를 호출하는 메소드
		System.out.println(msg+","+name);
		mylogic.testLogic();
	}
}
