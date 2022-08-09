package com.ruby.java.ch07.inheritance;

public class LMSTest2 {

	public static void main(String[] args) {
		Employee e = new Employee("RUBIN KIM", 63, "DATA SCIENTIST");
		Professor p = new Professor("JIYOUNG CHEON", 46, "ART CRAFTER");
		Student s = new Student("KIWON KIM", 46, "ARTIST");
		
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
	}

}
