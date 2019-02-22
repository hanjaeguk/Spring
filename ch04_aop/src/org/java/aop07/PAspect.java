package org.java.aop07;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;

public class PAspect {
	
	public static final Logger logger =Logger.getLogger(PAspect.class.getName());
	public static final String logMsg = "LogMsg-----------------------";
	
			
	public void around(ProceedingJoinPoint joinPoint) { // <aop:around를 동작>
//		System.out.println("클래스이름:" + joinPoint.getTarget().getClass().getName());
//		System.out.println("함수이름:" + joinPoint.getSignature().getName());
//		System.out.println("클래스명 포함 함수이름:" + joinPoint.getSignature().toShortString());
//		System.out.println("\n");
		
		logger.info(logMsg + joinPoint.getTarget().getClass().getName()+"\t"+
				joinPoint.getSignature().getName());
		
		try {
			System.out.println("강의장에 들어온다.");
			//핵심코드의 핵심함수를 PointCut
			joinPoint.proceed();
			
			System.out.println("점심을 먹는다.");
		}catch(Throwable e){
			System.out.println(e.getStackTrace());
			System.out.println("쫓겨난다.");
		} finally {
			System.out.println("강의장을 나간다. \n");
		}
	}
	
}
