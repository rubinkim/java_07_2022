package com.ruby.java.test2;

public class IfSwitchTest {

	public static void main(String[] args) {
		
		// if������ �����غ���
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
		System.out.println("IF������ ������ grade�� " + grade + "�̴�.");
	}

}
