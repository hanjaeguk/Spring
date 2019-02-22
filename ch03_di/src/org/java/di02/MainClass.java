package org.java.di02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:org/java/di02/appCTX.xml");
		
		AA obj = (AA)ctx.getBean("obj");
		
		System.out.println(obj.toString());
		
		ctx.close();
		
	}

}
