package com.ruby.java.ch07.inheritance;

public class Employee extends Person {
	private String dept;
	
//	기본 생성자 추가
	public Employee() {
		System.out.println("Employee 생성자 실행");
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
