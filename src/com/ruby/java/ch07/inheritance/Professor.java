package com.ruby.java.ch07.inheritance;

public class Professor extends Person {
	private String subject;
	
//  기본 생성자 추가
	public Professor() {
		System.out.println("Professor 생성자 실행");
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
