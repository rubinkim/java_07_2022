package com.ruby.java.ch07.inheritance_new;

public class LMSTest2 {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("������");
		e.setAge(21);
		e.setDept("��ǻ�� ���̾�");
		System.out.println(e.toString());
		
		Professor p = new Professor();
		p.setName("������");
		p.setAge(38);
		p.setSubject("Volley Ball");
		System.out.println(p.toString());
	}

}
