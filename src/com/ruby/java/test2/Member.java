package com.ruby.java.test2;

public class Member {
	
	private String name;
	private int age;
	
	public Member() {
		System.out.println("���ھ���.");
	}
	
	public Member(String name) {
		System.out.print("�̸� : ");
		System.out.println(name);
	}
	
	public Member(String name, int age) {
		System.out.print("�̸�  ���� : ");
		System.out.println(name + " " + age);
	}

	public static void main(String[] args) {
		System.out.println("main()�޼��� ����");
		new Member();
		new Member("Amy");
		new Member("Amy", 23);
	}
}
