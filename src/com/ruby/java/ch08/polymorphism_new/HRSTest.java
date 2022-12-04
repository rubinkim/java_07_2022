package com.ruby.java.ch08.polymorphism_new;

public class HRSTest {
	
	abstract class Employee{
		String name;
		int salary;
		public abstract void calcSalary();
		public abstract void calcBonus();
	}
	
	class Salesman extends Employee {
		public void calcSalary() {
			System.out.println("Salesman급여 = 기본급 + 판매수당");
		}
		public void calcBonus() {
			System.out.println("Salesman보너스 = 기본급 * 12 * 4");
		}
	}

	public static void main(String[] args) {

	}

}
