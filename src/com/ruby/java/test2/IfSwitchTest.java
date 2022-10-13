package com.ruby.java.test2;

public class IfSwitchTest {

	public static void main(String[] args) {
		
		// if문으로 실행해보기
		int score1 = 83;
		char grade;
		
		if(score1 >= 90) {
			grade = 'A';
		}
		else if(score1 >= 80) {
			grade = 'B';
		}
		else if(score1 >= 70) {
			grade = 'C';
		}
		else {
			grade = 'F';
		}
		System.out.println("IF문으로 실행한 grade는 " + grade + "이다.");
	}

}
