package com.ruby.java.ch07.inheritance_new2;

public class LMSTest {

	public static void main(String[] args) {
		
		Employee e = new Employee("천지영", 45, "공예");		
		System.out.println(e.toString());
		
		Professor p = new Professor("김기원", 44, "발레");
		System.out.println(p.toString());
		
		Student s = new Student("전다정", 31, "경제학");
		System.out.println(s.toString());
	}
}
