package com.ruby.java.ch07.inheritance_new;

public class LMSTest2 {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("이유빈");
		e.setAge(21);
		e.setDept("컴퓨터 사이언스");
		System.out.println(e.toString());
		
		Professor p = new Professor();
		p.setName("고희진");
		p.setAge(38);
		p.setSubject("Volley Ball");
		System.out.println(p.toString());
	}

}
