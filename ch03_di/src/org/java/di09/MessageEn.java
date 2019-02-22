package org.java.di09;

public class MessageEn implements Message {

	@Override
	public void sayHello(String name) {
		System.out.println("Hello!! My Name is "+ name);
	}

}
