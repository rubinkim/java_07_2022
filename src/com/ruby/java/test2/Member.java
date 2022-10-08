package com.ruby.java.test2;

public class Member {
	
	private String name;
	private int age;
	
	public Member() {
		System.out.println("인자없다.");
	}
	
	public Member(String name) {
		System.out.print("이름 : ");
		System.out.println(name);
	}
	
	public Member(String name, int age) {
		System.out.print("이름  나이 : ");
		System.out.println(name + " " + age);
	}

	public static void main(String[] args) {
		System.out.println("main()메서드 실행");
		new Member();
		new Member("Amy");
		new Member("Amy", 23);
	}
}
