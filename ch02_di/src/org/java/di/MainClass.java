package org.java.di;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
			
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("appCTX.xml");

		Example ex = (Example)ctx.getBean("ex");
		ex.disp();
		
		Testing text = (Testing)ctx.getBean("test");
		text.print();
		
		ctx.close();
	}

}
