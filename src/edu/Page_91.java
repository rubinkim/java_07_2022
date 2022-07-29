package edu;

public class Page_91 {

	public static void main(String[] args) {
		char c = 'A';
		
		System.out.printf("영어 대문자 A는 10진수로 %d이다.\n",(int)c);
		System.out.println("영어 대문자 A는 2진수로 0b" + Integer.toBinaryString((int)c) + "이다.");
		System.out.printf("영어 대문자 A는 8진수로 %#o이다.\n", (int)c);
		System.out.printf("영어 대문자 A는 16진수로 %#x이다.\n", (int)c);
		System.out.println();
		
		c ^= (1 << 5);
	    System.out.println("변수 c는 알파벳으로 " + c + "이다.");
	    System.out.println("변수 c는 2진수로 0b" + Integer.toBinaryString((int)c) + "이다.");
	    System.out.println("변수 c는 10진수로 " + (int)c + "이다.");
	    System.out.printf("변수 c는 8진수로 %#o이다.\n", (int)c);
	    System.out.printf("변수 c는 16진수로 %#x이다.\n", (int)c);
	    
		
	}
}
