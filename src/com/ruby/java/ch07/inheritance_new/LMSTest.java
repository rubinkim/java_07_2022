package com.ruby.java.ch07.inheritance_new;

public class LMSTest {

	public static void main(String[] args) {
		Employee e = new Employee();
		Professor p = new Professor();
		Student s = new Student();
		
		e.setName("김한용");
		e.setAge(64);
		e.setDept("빅데이터");
		
		p.setName("천지영");
		p.setAge(45);
		p.setSubject("공예");
		
		s.setName("김기원");
		s.setAge(44);
		s.setMajor("조소");
		
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
	}
}
