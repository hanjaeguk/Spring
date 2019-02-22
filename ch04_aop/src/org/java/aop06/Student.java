package org.java.aop06;

import java.util.Scanner;

public class Student implements Person {

	@Override
	public void work() {
		System.out.println("공부를 합니다!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수를입력하세요.");
		int su = sc.nextInt();
		if(su == 5) {
			System.out.println(su/0);
		}else {
			System.out.println(++su);
		}
		sc.close();
	}

}
