package com.ruby.java.ch07.inheritance;

public class LMSTestNew {

	public static void main(String[] args) {
		EmployeeNew e = new EmployeeNew();
		ProfessorNew p = new ProfessorNew();
		StudentNew s = new StudentNew();
		
		e.setName("김한용");
		e.setAge(63);
		e.setDept("데이터 분석");
		
		p.setName("천지영");
		p.setAge(46);
		p.setSubject("공예");
		
		s.setName("김기원");
		s.setAge(46);
		s.setMajor("조각");
		
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
	}
}
