package com.ruby.java.ch07.inheritance;

public class Student extends Person {
	private String major;
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String toString() {
//		this.getName()과 this.getAge()를 사용해도 좋다
		return getName() + " : " + getAge() + " : " + major;
	}
}
