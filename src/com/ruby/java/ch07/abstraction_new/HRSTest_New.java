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

class Consultant1 extends Employee1{
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	}
	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 * 12 * 12");
	}
}

abstract class Manager1 extends Employee1{
	public abstract void calcSalary();
	public abstract void calcBonus();
}

class Director1 extends Manager1{
	public void calcSalary() {
		System.out.println("Director 급여 = 기본급 + 팀 특별한 수당");
	}
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 6");
	}
}

public class HRSTest_New {

	public static void main(String[] args) {
		
		Salesman1 s = new Salesman1();
		Consultant1 c = new Consultant1();
		Director1 d = new Director1();
			
		s.calcSalary();
		s.calcBonus();
		System.out.println();
		c.calcSalary();
		c.calcBonus();
		System.out.println();
		d.calcSalary();
		d.calcBonus();
	}

}
