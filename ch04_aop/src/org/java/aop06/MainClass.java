package org.java.aop06;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:org/java/aop06/appCTX.xml");
		
		try {
			
		Person student = (Person) ctx.getBean("student");
		student.work();
		
		Person teacher = (Person) ctx.getBean("teacher");
		teacher.work();
		} catch (Throwable e) {
	
		}
		
	
		ctx.close();

	}
}
