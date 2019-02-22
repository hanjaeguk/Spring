package org.java.aop01;

public class Papa implements Person {

	@Override
	public void awake() {
		System.out.println("일어나!!");
	}

	@Override
	public void work() {
		System.out.println("회사출근...");
	}

	@Override
	public void sleep() {
		System.out.println("퇴근후 잠들기");
	}

}
