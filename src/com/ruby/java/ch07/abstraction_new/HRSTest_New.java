package com.ruby.java.ch07.abstraction_new;

abstract class Employee1{
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
}

class Salesman1 extends Employee1{
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 기본 수당");
	}
	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
	}
}

public class HRSTest_New {

	public static void main(String[] args) {
		
		Salesman1 s = new Salesman1();
		
		s.calcSalary();
	}

}
