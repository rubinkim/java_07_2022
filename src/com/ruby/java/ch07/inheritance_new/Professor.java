package com.ruby.java.ch07.inheritance_new;

public class Professor extends Person {
	private String subject;
	
	public Professor() {
		System.out.println("Professor 클래스의 defalut constructor");
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
