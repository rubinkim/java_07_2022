package com.ruby.java.ch07.inheritance;

public class LMSTest {

	public static void main(String[] args) {
		Employee e = new Employee();
		Professor p = new Professor();
		Student s = new Student();
		
		e.setName("김한용");
		e.setAge(64);
		e.setDept("입학처");
		
		p.setName("천지영");
		p.setAge(47);
		p.setSubject("빅데이터");
		
		s.setName("김기원");
		s.setAge(47);
		s.setMajor("컴퓨터과학");
		
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
	}
}
