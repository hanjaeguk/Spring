package org.java.di01;

public class AA { //DI 생성자 설정
	
	private int a;
	private int b;
	
	public AA() {
		System.out.println("기본생성자");
	}
	
	public AA(int a,int b) {
		this.a = a;
		this.b = b;
	}
	
	public void disp() {
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
	
}
