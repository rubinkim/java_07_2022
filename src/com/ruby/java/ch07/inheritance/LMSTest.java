package com.ruby.java.ch07.inheritance;

public class LMSTest {

	public static void main(String[] args) {
		Employee e = new Employee();
		Professor p = new Professor();
		Student s = new Student();
		
		e.setName("���ѿ�");
		e.setAge(64);
		e.setDept("����ó");
		
		p.setName("õ����");
		p.setAge(47);
		p.setSubject("������");
		
		s.setName("����");
		s.setAge(47);
		s.setMajor("��ǻ�Ͱ���");
		
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
	}
}
