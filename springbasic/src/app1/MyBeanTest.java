package app1;
/*
 * 결합도가 극도로 높은 프로그램
 * 	=> 클래스 간의 결합도가 강하고 의존성이 높다.
 * 	=> 사용되는 클래스를 변경하면 이 클래스를 사용하고 있는 모든 소스를 수정해야 한다.
 * 		즉, 수정해야 하는 범위가 넓어진다. OOP특성도 적용되어 있지 않다.
*/
public class MyBeanTest {
	public static void main(String[] args) {
		//MyBeanStyleA obj = new MyBeanStyleA();
		// ->객체를 교체하면 run, show의 매개변수와 obj의 메소드도 다 수정해야한다.
		MyBeanStyleB obj = new MyBeanStyleB();
		run(obj);
		show(obj);
		
	}
	// 메소드 두 곳에서 같은 객체를 받고 다른 스타일로 사용
	// public static void run(MyBeanStyleA obj)
	public static void run(MyBeanStyleB obj) {
		System.out.println("************************");
		/*obj.testHello("현빈");
		obj.testHello("현빈");*/
		obj.hello("현빈");
		obj.hello("현빈");
		System.out.println("************************");
	}
	// public static void show(MyBeanStyleA obj)
	public static void show(MyBeanStyleB obj) {
		System.out.println("========================");
		/*obj.testHello("현빈");
		obj.testHello("현빈");*/
		obj.hello("현빈");
		obj.hello("현빈");
		System.out.println("========================");
	}
	
}
