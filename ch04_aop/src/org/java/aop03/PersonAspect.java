package org.java.aop03;

import org.aspectj.lang.JoinPoint;

public class PersonAspect {
	public void awake(JoinPoint joinpont) {
		System.out.println("일어났음.");
	}

}
