package edu;

public class Page_91_practice {

	public static void main(String[] args) {
		short a = -314;
		System.out.println("음수 -314는 2진수로 0b " + Integer.toBinaryString(a) + "이다.");
		System.out.printf("음수 -314는 8진수로 %#o이다.\n", a);
		System.out.printf("음수 -314는 16진수로 %#x이다.\n", a);
	}
}
