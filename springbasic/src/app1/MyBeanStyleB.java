package app1;
// Spring에서는 객체를 bean이라고 부른다.
// 클래스를 만들어서 운영하는 방식이 정해짐(클래스 만드는 방식은 다르지x)
public class MyBeanStyleB {
	public void hello(String name) {
		System.out.println("hello...,"+name);
	}
}
