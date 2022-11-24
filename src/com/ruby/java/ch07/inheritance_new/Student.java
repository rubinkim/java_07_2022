package com.ruby.java.ch07.inheritance_new;

public class Student extends Person {
	private String major;
	
	public Student() {
		System.out.println("StudentŬ������ �⺻ �������̴�.");
	}
	
	public Student(String name, int age, String major) {
		super.setName(name);
		super.setAge(age);
		this.major = major;
	}
	
	public String getMajor()
	{
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return getName() + " : " + getAge() + " ==> " + major;
	}
}
