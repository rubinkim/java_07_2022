package com.ruby.java.ch07.inheritance_new;

public class LMSTest {

	public static void main(String[] args) {
		Employee e = new Employee();
		Professor p = new Professor();
		
		e.setName("���ѿ�");
		e.setAge(64);
		e.setDept("������");
		
		p.setName("õ����");
		p.setAge(45);
		p.setSubject("����");
		
		System.out.println(e.toString());
		System.out.println(p.toString());
	}
}
