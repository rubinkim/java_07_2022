package com.ruby.java.ch07.inheritance;

public class Student extends Person {
	private String major;
	
//	�⺻ ������ �߰�
	public Student() {
		System.out.println("Student ������ ����");
	}
	
//	������ �����ε�
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
		System.out.println("Student(name, age, major) ������ ����");
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String toString() {
//		this.getName()�� this.getAge()�� ����ص� ����
//		overriding�� �� super�� �̿��ؼ� PersonŬ������ toString()�޼��忡 �����ϱ�
		return super.toString() + " : " + major;
	}
}
