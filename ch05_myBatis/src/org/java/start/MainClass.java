package org.java.start;

import org.java.ui.Ui;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("appCTX.xml");
		
		Ui friendui = (Ui)ctx.getBean("friendUi");
		
		friendui.execute();
	}

}

