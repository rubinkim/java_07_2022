package com.ruby.java.ch07.inheritance_new2;

public class Student extends Person {
	private String major;
	
	public Student() {
		super();
		System.out.println("Student ������ ����!");
	}
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
		System.out.println("Student(name, age, major) ������ ����!");
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return super.toString() + " : " + major;
	}
}