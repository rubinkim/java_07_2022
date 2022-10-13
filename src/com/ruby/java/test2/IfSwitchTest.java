package com.ruby.java.test2;

public class IfSwitchTest {

	public static void main(String[] args) {
		
		// if������ �����غ���
		int score1 = 83;
		char grade1;
		
		if(score1 >= 90) {
			grade1 = 'A';
		}
		else if(score1 >= 80) {
			grade1 = 'B';
		}
		else if(score1 >= 70) {
			grade1 = 'C';
		}
		else {
			grade1 = 'F';
		}
		System.out.println("IF������ ������ grade�� " + grade1 + "�̴�.");
		
		
		// switch���� �����غ���
		int score2 = 83;
		char grade2;
		
		switch(score2) {
		case 90 : {
			grade2 = 'A';
			break;
		}
		case 83: {
			grade2 = 'B';
			break;
		}
		case 75: {
			grade2 = 'C';
			break;
		}
		default:{
			grade2 = 'F';			
		}
		}
		
		System.out.println("SWITCH������ ������ grade�� " + grade2 + "�̴�.");
		System.out.println(score2 + "  " + grade2);
		
		// break���� ����ϴ� switch�� �����غ���
		int a = 12; int b = 2;
		int answer = 0;
		char op = '+';
		
		switch(op) {
		case '+': answer = a + b; break;
		case '-': answer = a - b; break;
		case '*': answer = a * b; break;
		case '/': answer = a / b; break;
		}
		System.out.println("break���� ����ϴ� switch�������� answer�� " + answer + "�̴�.");
	}
}
