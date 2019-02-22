package org.java.di09;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:org/java/di09/appCTX.xml");
		
		Message en = (Message) ctx.getBean("messageEn");
		en.sayHello("Spring");
		
		Message kr = (Message) ctx.getBean("messageKr");
		kr.sayHello("스프링");
		
		ctx.close();
		
	}

}
