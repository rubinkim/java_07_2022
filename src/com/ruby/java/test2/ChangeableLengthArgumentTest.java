package com.ruby.java.test2;

public class ChangeableLengthArgumentTest {
	// 가변길이 인자를 전달받는 매개변수만 있는 메서드 선언
	static void test1(int ... v) {
		System.out.print("매개변수의 개수는 " + v.length + "개이고 ");
		System.out.print("전달받은 인자는 ");
		for(int x : v) {
			System.out.print(x + " ");
		}
		System.out.print("이다.");
		System.out.println();
	}
	
	// 가변길이 인자를 전달받는 매개변수와 더불어서 일반인자도 전달받는 복합선언인 경우
	static void test2(String name, int ... v) {
		System.out.print("첫번째 전달받은 인자는 " + name + "이고.");
		System.out.print("두번째 전달받은 인자는 ");
		for(int x : v) {
			System.out.print(x + " ");
		}
		System.out.print("이다.");
		System.out.println();
	}
	
	public static void main(String[] args) {
		test1(1);
		test1(1,2);
		test1(1,2,3);
		
		System.out.println();
		
		test2("김한용", 1);
		test2("천지영", 1,2);
		test2("김기원", 1,2,3);
	}
}
