package org.java.di01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AA a = new AA();
		AA b = new AA(10,20);
		a.disp();
		
		System.out.println("-------------------------");
		
		// 패키지 안에 XML파일이 있을때
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:org/java/di01/appCTX.xml");	
		// src에 XML파일이 있을때
//		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("appCTX.xml");
		AA odj1 = (AA)ctx.getBean("obj1");
		AA odj2 = (AA)ctx.getBean("obj2");
		odj2.disp();
		ctx.close();
	}

}
