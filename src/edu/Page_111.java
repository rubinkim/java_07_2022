package edu;

import java.util.Scanner;

public class Page_111 {

	public static void main(String[] args) {
		int a = 12;
		int b = 5;
		Scanner sc = new Scanner(System.in);
		char op = sc.next().charAt(0);
		
		switch(op) {
		case '+': {
			System.out.println(a + b);
			break;
			}
		case '-': {
			System.out.println(a - b);
			break;
			}
		case '*': {
			System.out.println(a * b);
			break;
			}
		case '/': {
			System.out.println(a / b);
			break;
			}
		case '%': {
		    System.out.println(a % b);
		    break;
			}
		default: System.out.println("산술 연산자를 입력하세요!");
		}
	}
}
