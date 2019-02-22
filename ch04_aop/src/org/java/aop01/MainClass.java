package org.java.aop01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:org/java/aop01/appCTX.xml");
		
		Person baby = (Person)ctx.getBean("baby");
		baby.awake();
		baby.work();
		baby.sleep();
		
		System.out.println("--------------------");
		
		Person mom = (Person)ctx.getBean("mom");
		mom.awake();
		mom.work();
		mom.sleep();
		
		System.out.println("--------------------");
		
		Person papa = (Person)ctx.getBean("papa");
		papa.awake();
		papa.work();
		papa.sleep();
		
		ctx.close();

	}

}
