package org.java.aop04;

import org.aspectj.lang.JoinPoint;

public class PAspect {
	public void awake(JoinPoint joinpont) {
		System.out.println("일어나다!");
	}
	
	public void sleep(JoinPoint joinpoint) {
		System.out.println("잠을자다!");
	}

}
