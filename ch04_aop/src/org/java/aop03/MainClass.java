package org.java.aop03;

import org.java.aop03.Person;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:org/java/aop03/appCTX.xml");
		
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
