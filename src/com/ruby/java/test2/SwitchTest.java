package com.ruby.java.test2;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		
		//연산자값 가져오기
		int a = 12;  int b = 2;
		int answer = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" +, -, *, / 중 하나의 연산자를 입력하세요 : ");
		String op = sc.next();
		
		switch(op) {
		case "+": answer = a + b; break;
		case "-": answer = a - b; break;
		case "*": answer = a * b; break;
		case "/": answer = a / b; break;
		}
		
		System.out.println("선택된 연산자는 " + op + "로써 계산된 값은 " + answer + "이다.");
	}
}
