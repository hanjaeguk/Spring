package org.java.di06;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:org/java/di06/appCTX.xml");
		
		StudentInfo info = (StudentInfo)ctx.getBean("studentInfo");
		info.disp();
		
		ctx.close();
		

	}

}
