package org.java.aop07;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:org/java/aop07/appCTX.xml");
		
		Person student = (Person) ctx.getBean("student");
		student.work();
		
		Person teacher = (Person) ctx.getBean("teacher");
		teacher.work();
	
	
		ctx.close();

	}
}

