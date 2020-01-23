package di.setter02;

public class ServiceImpl implements Service {
	Logic mylogic; // Setter Injection
	// String은 원래 설정파일에 명시하면 안되는 내용
	// (고정된 값이 아니라 클라이언트가 입력하는 값에 따라 달라지는 변수들)
	String name; // Constructor Injection
	String msg; // Constructor Injection
	
	// 기본생성자
	public ServiceImpl() {
		
	}
	
	public ServiceImpl(String name, String msg) {
		super();
		this.name = name;
		this.msg = msg;
		System.out.println("매개변수 2개 생성자");
	}

	public ServiceImpl(Logic mylogic, String name, String msg) {
		super();
		this.mylogic = mylogic;
		this.name = name;
		this.msg = msg;
		System.out.println("ServiceImpl의 매개변수 3개 생성자");
	}
	

	public void setMylogic(Logic mylogic) {
		this.mylogic = mylogic;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	
	@Override
	public void test() {
		//Logic의 메소드를 호출하는 메소드
		System.out.println(msg+","+name);
		mylogic.testLogic();
	}
}
