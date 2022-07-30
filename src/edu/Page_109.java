package edu;

import java.util.Scanner;

public class Page_109 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		char result;
		
		if(score >= 90) result = 'A';
		else if(score >= 80) result = 'B';
		else if(score >= 70) result = 'C';
		else if(score >= 60) result = 'D';
		else result = 'F';
		
		System.out.printf("당신의 시험 점수는 %d점이고 학점은 %c입니다.", score, result);
	}

}
