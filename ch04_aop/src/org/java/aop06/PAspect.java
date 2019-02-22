package org.java.aop06;

import org.aspectj.lang.JoinPoint;

public class PAspect {
	
	// 핵심함수 전
	public void before(JoinPoint joinpoint) {
		System.out.println("강의장에 들어온다.");
	}
	
	// 정상종료
	public void afterReturning(JoinPoint joinpoint) {
		System.out.println("점심을 먹으러간다.");
	}
	
	// 예외발생
	public void afterThrowing(JoinPoint joinpoint) {
		System.out.println("쫓겨나간다.");
	}
	
	// 핵심함수 후
	public void after(JoinPoint joinpoint) {
		System.out.println("강의장을 나간다.\n");
	}
}
