package com.ruby.java.ch07.inheritance;

public class Professor extends Person {
	private String subject;
	
//  �⺻ ������ �߰�
	public Professor() {
		System.out.println("Professor ������ ����");
	}
	
//	������ �����ε�
	public Professor(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
		System.out.println("Professor(name, age, subject) ������ ����!");
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String toString() {
		return super.toString() + " : " + subject;
	}
}