package com.ruby.java.ch07.inheritance_new;

public class Professor extends Person {
	private String subject;
	
	public Professor() {
		System.out.println("Professor 클래스의 defalut constructor");
	}
	
	public Professor(String name, int age, String subject) {
		System.out.println("Professor클래스의 추가 생성자");
		super.setName(name);
		super.setAge(age);
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String toString() {
		return getName() + " : " + getAge() + " ==> " + subject;
	}
}
