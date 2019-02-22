package org.java.aop02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:org/java/aop02/appCTX.xml");
		
		PersonAspect pBaby = (PersonAspect) ctx.getBean("pbaby");
		pBaby.result();
		System.out.println("-------------");
		
		PersonAspect pMom = (PersonAspect) ctx.getBean("pmom");
		pMom.result();
		System.out.println("-------------");

		PersonAspect pPapa = (PersonAspect) ctx.getBean("ppapa");
		pPapa.result();
		System.out.println("-------------");
		
		ctx.close();
		
		
	}

}
