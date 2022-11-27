package com.ruby.java.ch07.inheritance_new2;

public class Employee extends Person {
	private String dept;
	
	public Employee() {
		super();
		System.out.println("Employee ������ ����!");
	}
	
	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
		System.out.println("Employee(name, age, dept) ������ ����!");
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString() {
		return super.toString() + " : " + dept;
	}
}
