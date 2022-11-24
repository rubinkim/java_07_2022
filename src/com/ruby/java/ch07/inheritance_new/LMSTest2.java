package com.ruby.java.ch07.inheritance_new;

public class LMSTest2 {

	public static void main(String[] args) {
		Employee e = new Employee("김유빈", 22, "computer science");
		System.out.println(e.toString());
		
		Professor p = new Professor("니아 리드", 23, "페퍼저축은행");

		System.out.println(p.toString());
		
		Student s = new Student("Sopranos", 2002, "HBO");
		System.out.println(s.toString());
	}

}
