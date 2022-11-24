package com.ruby.java.ch07.inheritance_new;

public class Employee extends Person {
	private String dept;
	
	public Employee() {
		System.out.println("Employee Ŭ������ �⺻ ������");
	}
	
	public Employee(String name, int age, String dept) {
		super.setName(name);
		super.setAge(age);
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString() {
		System.out.println("e �ν��Ͻ��� �ʵ� ���� ���캸��.");
		return super.getName() + " : " + super.getAge() + " ==> " + this.dept;
	}
}
