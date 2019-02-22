package org.java.di03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		AA aa = new AA(10,20);
		BB bb = new BB();
		
		bb.setA(77);
		bb.setB(88);
		
		CC cc = new CC(aa);
		cc.setBb(bb);
		
		System.out.println("-----------------------");
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:org/java/di03/appCTX.xml");
		
		CC obj = (CC) ctx.getBean("cc");
		obj.disp();
		
		ctx.close();
		
	}
}
