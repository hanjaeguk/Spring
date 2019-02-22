package org.java.di09;

public class MessageKr implements Message {

	@Override
	public void sayHello(String name) {
		System.out.println("안녕하세요."+ name + " 입니다.");
	}

}
