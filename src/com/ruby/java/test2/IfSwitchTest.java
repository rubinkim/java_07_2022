package com.ruby.java.test2;

public class IfSwitchTest {

	public static void main(String[] args) {
		
		// if문으로 실행해보기
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
		System.out.println("IF문으로 실행한 grade는 " + grade1 + "이다.");
		
		
		// switch문을 실행해보기
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
		
		System.out.println("SWITCH문으로 실행한 grade는 " + grade2 + "이다.");
		System.out.println(score2 + "  " + grade2);
		
		
	}
}
