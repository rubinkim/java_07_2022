package com.ruby.java.ch07.inheritance_new;

public class LMSTest2 {

	public static void main(String[] args) {
		Employee e = new Employee("������", 22, "computer science");
		System.out.println(e.toString());
		
		Professor p = new Professor();
		p.setName("������");
		p.setAge(38);
		p.setSubject("Volley Ball");
		System.out.println(p.toString());
		
		Student s = new Student();
		s.setName("���ϰ�");
		s.setAge(27);
		s.setMajor("Setter");
		System.out.println(s.toString());
	}

}