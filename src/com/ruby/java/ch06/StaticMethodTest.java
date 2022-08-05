package com.ruby.java.ch06;

public class StaticMethodTest {
	
	int num = 123;
	
	public static void print1() {
		//int num2 = num;  // ¿À·ù
		System.out.println("Hello");
	}
	
	public void print2() {
		int num3 = num;
		System.out.println("Java");
	}
	
	public static void main(String[] args) {
		StaticMethodTest.print1();
		StaticMethodTest exam = new StaticMethodTest();
		exam.print2();
	}
	
	static {
		System.out.println("Rubin");
		System.out.println("Kiwon");
	}

}
