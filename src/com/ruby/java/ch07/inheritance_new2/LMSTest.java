package com.ruby.java.ch07.inheritance_new2;

public class LMSTest {

	public static void main(String[] args) {
		
		Employee e = new Employee("õ����", 45, "����");		
		System.out.println(e.toString());
		
		Professor p = new Professor("����", 44, "�߷�");
		System.out.println(p.toString());
		
		Student s = new Student("������", 31, "������");
		System.out.println(s.toString());
	}
}
