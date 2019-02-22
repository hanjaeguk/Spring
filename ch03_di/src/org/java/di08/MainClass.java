package org.java.di08;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String config1 = "classpath:org/java/di08/appCTX1.xml";
		String config2 = "classpath:org/java/di08/appCTX2.xml";
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config1,config2);
		
		AA aa = (AA)ctx.getBean("aa");
		System.out.println(aa.toString());
		
		BB bb = (BB)ctx.getBean("bb");
		System.out.println(bb.toString());
		
		ctx.close();
	}

}
