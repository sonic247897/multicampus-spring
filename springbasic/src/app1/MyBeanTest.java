package app1;
/*
 * ���յ��� �ص��� ���� ���α׷�
 * 	=> Ŭ���� ���� ���յ��� ���ϰ� �������� ����.
 * 	=> ���Ǵ� Ŭ������ �����ϸ� �� Ŭ������ ����ϰ� �ִ� ��� �ҽ��� �����ؾ� �Ѵ�.
 * 		��, �����ؾ� �ϴ� ������ �о�����. OOPƯ���� ����Ǿ� ���� �ʴ�.
*/
public class MyBeanTest {
	public static void main(String[] args) {
		//MyBeanStyleA obj = new MyBeanStyleA();
		// ->��ü�� ��ü�ϸ� run, show�� �Ű������� obj�� �޼ҵ嵵 �� �����ؾ��Ѵ�.
		MyBeanStyleB obj = new MyBeanStyleB();
		run(obj);
		show(obj);
		
	}
	// �޼ҵ� �� ������ ���� ��ü�� �ް� �ٸ� ��Ÿ�Ϸ� ���
	// public static void run(MyBeanStyleA obj)
	public static void run(MyBeanStyleB obj) {
		System.out.println("************************");
		/*obj.testHello("����");
		obj.testHello("����");*/
		obj.hello("����");
		obj.hello("����");
		System.out.println("************************");
	}
	// public static void show(MyBeanStyleA obj)
	public static void show(MyBeanStyleB obj) {
		System.out.println("========================");
		/*obj.testHello("����");
		obj.testHello("����");*/
		obj.hello("����");
		obj.hello("����");
		System.out.println("========================");
	}
	
}