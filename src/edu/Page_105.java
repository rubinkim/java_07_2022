package edu;

import java.util.Scanner;

public class Page_105 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		String result = "";
		
		if(score >= 60) {
			result = "�հ�";
		}
		else result = "���հ�";
		
		System.out.println(result);
	}
}
