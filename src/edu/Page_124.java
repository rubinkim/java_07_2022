package edu;

public class Page_124 {

	public static void main(String[] args) {
		//for loop : 제어변수 선언및 초기화,반복조건식,증감식,실행문
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		System.out.println("OK");
		System.out.println();
		
		//while loop : 제어변수선언및 초기화,반복조건문,실행문,증감식
		int i = 0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("OK");
		System.out.println();
		
		//do while loop : 제어변수선언및 초기화,실행문,증감식,반복조건문
		int j = 0;
		do {
			System.out.println(j);
			j++;
		}
		while(j<10);
		System.out.println("OK");
	}
}
