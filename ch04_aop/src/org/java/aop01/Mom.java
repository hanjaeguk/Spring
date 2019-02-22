package org.java.aop01;

public class Mom implements Person {

	@Override
	public void awake() {
		System.out.println("일어나다");
	}

	@Override
	public void work() {
		System.out.println("집안일한다!");
	}

	@Override
	public void sleep() {
		System.out.println("잠든다");
	}
}
