package org.java.di10;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:org/java/di10/appCTX.xml");
		
		Pencil pencil4 = (Pencil) ctx.getBean("pencil4B");
		pencil4.use();
		Pencil pencil6 = (Pencil) ctx.getBean("pencil6B");
		pencil6.use();
		Pencil pencilEarser = (Pencil) ctx.getBean("pencilEarser");
		pencilEarser.use();
	}

}
