package com.ruby.java.ch07.abstraction_new;

public class HRSTest {

	public static void main(String[] args) {
		
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Manager m = new Manager();
		Director d = new Director();
		
		s.calcSalary();
		c.calcSalary();
		m.calcSalary();
		d.calcSalary();
	}
}
