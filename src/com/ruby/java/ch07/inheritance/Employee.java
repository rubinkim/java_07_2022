package com.ruby.java.ch07.inheritance;

public class Employee extends Person {
	private String dept;
	
//	�⺻ ������ �߰�
	public Employee() {
		System.out.println("Employee ������ ����");
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
