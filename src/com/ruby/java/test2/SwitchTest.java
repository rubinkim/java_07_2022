package com.ruby.java.test2;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		
		//�����ڰ� ��������
		int a = 12;  int b = 2;
		int answer = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" +, -, *, / �� �ϳ��� �����ڸ� �Է��ϼ��� : ");
		String op = sc.next();
		
		switch(op) {
		case "+": answer = a + b; break;
		case "-": answer = a - b; break;
		case "*": answer = a * b; break;
		case "/": answer = a / b; break;
		}
		
		System.out.println("���õ� �����ڴ� " + op + "�ν� ���� ���� " + answer + "�̴�.");
	}
}
