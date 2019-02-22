package org.java.aop02;

public class PersonAspect { // 공통클래스 Aspect

	private Person person;
	
	public PersonAspect() {}
	
	public PersonAspect(Person person) {
		this.person = person;
	}
	
	public void result() {
		this.awake();
		person.work();
		this.sleep();
	}
	
	
	//공통함수
	public void awake() { // 공통함수 Advice
		System.out.println("일어난다.");
	}
	
	public void sleep() { // // 공통함수 Advice
		System.out.println("잠잔다");
		
	}

}
