package com.ruby.java.ch07.abstraction;

abstract class Employee{
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
}

class Salesman extends Employee{
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판매 수당");
	}
	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본급  * 12 * 4");
	}
}

abstract class Manager extends Employee{
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}
}

class Consultant extends Employee{
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	}
	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
	}
}

class Director extends Manager{
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 6");
	}
}

public class HRSTest {

	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		//Manager m = new Manager(); Manager클래스는 추상클래스로 인스턴스를 생성할 수 없다.
		Director d = new Director();
		
		s.calcBonus();
		c.calcBonus();
		d.calcBonus();
	}

}
