package com.herbmall.test;

public class Person {
	//싱글톤 패턴 - 인스턴스를 하나만 생성하는 디자인패턴
	/* Person 클래스를 메모리에 한 번만 올리게 막는다
	[1] 생성자를 private로 => new연산자를 사용하여, 객체 생성 불가
	[2] get 메서드 만들기
	[3] 멤버변수로 Person을 담을 수 있는 instance 변수를 만든다
		- static으로 지정해서 한 개만 만들어지게 한다
	*/
	private static Person instance; //static 변수는 중복해서 생성되지 않고, 공유한다는 특성 이용
	private Person(){
				
	}
	
	public static Person getInstance(){
		if(instance == null)
		instance = new Person();
	/*[3] null이면 new로 Person 인스턴스 생성 */
		return instance;
	}
	
	public void showInfo() {
		System.out.println("Person클래스의 showInfo()메서드 123456 GITHUB 테스트");
	}
	
}
