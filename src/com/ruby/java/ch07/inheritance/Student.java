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
//		overriding할 때 super를 이용해서 Person클래스의 toString()메서드에 접근하기
		return super.toString() + " : " + major;
	}
}
