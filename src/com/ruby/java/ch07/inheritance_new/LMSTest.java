package com.ruby.java.ch07.inheritance_new;

public class LMSTest {

	public static void main(String[] args) {
		Employee e = new Employee();
		Professor p = new Professor();
		Student s = new Student();
		
		e.setName("���ѿ�");
		e.setAge(64);
		e.setDept("������");
		
		p.setName("õ����");
		p.setAge(45);
		p.setSubject("����");
		
		s.setName("����");
		s.setAge(44);
		s.setMajor("����");
		
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
	}
}
