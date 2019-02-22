package org.java.aop05;

import org.aspectj.lang.JoinPoint;

public class PAspect {
	public void open(JoinPoint joinpoint) {
		System.out.println("강의장에 들어온다!");
	}
	
	public void close(JoinPoint joinpoint) {
		System.out.println("강의강을 나간다! \n");
	}
	
}
