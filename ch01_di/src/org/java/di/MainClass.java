package org.java.di;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * 클래스간 결합이 강해지면 의존이 높앚면서 코드를 수정하는
			범위가 넓어질 가능성이 높다.​
			클래스간의 결합도는 약하게 의존성은 낮게 작성!!
			​
			의존성이란 클래스와 클래스간의 관계를 말한다.
			​
			DI(Dependency Injection) 의존성을 처리하는 방법으로
			객체를 외부로부터 전달받는 구현방식
		 * 
		 * */
		
		Su s = new Su();
		s.disp();
		System.out.println("---------------");
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("appCTX.xml");
		Su su = (Su)ctx.getBean("su");
		su.disp();
		ctx.close();
		
		
		

	}

}
