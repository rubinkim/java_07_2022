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
//		this.getName()�� this.getAge()�� ����ص� ����
//		overriding�� �� super�� �̿��ؼ� PersonŬ������ toString()�޼��忡 �����ϱ�
		return super.toString() + " : " + major;
	}
}
