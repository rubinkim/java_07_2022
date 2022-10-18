package com.ruby.java.test2;

public class ThisTest3 {

	public static void main(String[] args) {
		// 알파벳 26자를 배열에 저장하고 출력하기
		char letter = 'A';
		char[] alphabet = new char[26];
		
		System.out.println(letter+1);
		System.out.println((char)(letter+1));
		
		for(int i=0; i<alphabet.length; i++) {
			alphabet[i] = (char)(letter + i);
		}
		System.out.println(alphabet);
		
		for(char c : alphabet) {
			System.out.print(c);
		}
		
		System.out.println();
		
		// 배열에 저장된 성적들의 합계,평균,최고,최저 점수 구하기
		int[] score = {93,100,72,91,87};
		int sum = 0;
		int max = 0;
		int min = 999;
		float avg = 0.0f;
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
			if(max < score[i]) max = score[i];
			if(min > score[i]) min = score[i]; 
		}
		
		avg = sum / score.length;
		
		System.out.println("성적 합계는 : " + sum);
		System.out.println("성적 평균은 : " + avg);
		System.out.println("최고 성적은 : " + max);
		System.out.println("최저 성적은 : " + min);
		
		// 명령행 매개변수 이용하기
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
