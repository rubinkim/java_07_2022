package com.ruby.java.ch07.abstraction_new;

public class Director extends Manager {

	public void calcSalary() {
		System.out.println("Director급여 = Manager급여 * 0.8");
	}
}
