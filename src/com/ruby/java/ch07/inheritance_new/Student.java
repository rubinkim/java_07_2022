package com.ruby.java.ch07.inheritance_new;

public class Student extends Person {
	private String major;
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return getName() + " : " + getAge() + " ==> " + major;
	}
}
