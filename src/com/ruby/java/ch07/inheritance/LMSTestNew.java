package com.ruby.java.ch07.inheritance;

public class LMSTestNew {

	public static void main(String[] args) {
		EmployeeNew e = new EmployeeNew();
		ProfessorNew p = new ProfessorNew();
		StudentNew s = new StudentNew();
		
		e.setName("���ѿ�");
		e.setAge(63);
		e.setDept("������ �м�");
		
		p.setName("õ����");
		p.setAge(46);
		p.setSubject("����");
		
		s.setName("����");
		s.setAge(46);
		s.setMajor("����");
		
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
	}
}
