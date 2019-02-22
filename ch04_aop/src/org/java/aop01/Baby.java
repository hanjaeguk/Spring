package org.java.aop01;

public class Baby implements Person {

	@Override
	public void awake() {
		System.out.println("일어나다.");
	}

	@Override
	public void work() {
		System.out.println("유치원가다!");
	}

	@Override
	public void sleep() {
		System.out.println("아빠엄마랑 같이 잔다");
	}

}
