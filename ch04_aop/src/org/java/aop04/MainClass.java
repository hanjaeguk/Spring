package org.java.aop04;

import org.java.aop04.Person;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:org/java/aop04/appCTX.xml");
		
		System.out.println("--------------------");
		
		Person baby = (Person)ctx.getBean("baby");
		baby.work();

		System.out.println("--------------------");

		Person mom = (Person)ctx.getBean("mom");
		mom.work();
		
		System.out.println("--------------------");
		
		Person papa = (Person)ctx.getBean("papa");
		papa.work();
		
		ctx.close();

		
		
	}

}
