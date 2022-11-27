package com.ruby.java.ch07.inheritance_new2;

public class Professor extends Person {
	private String subject;
	
	public Professor() {
		super();
		System.out.println("Professor 积己磊 角青!");
	}
	
	public Professor(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
		System.out.println("Professor(name, age, subject) 积己磊 角青!");
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
