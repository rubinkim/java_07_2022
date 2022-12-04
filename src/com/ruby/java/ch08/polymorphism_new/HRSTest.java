package com.ruby.java.ch08.polymorphism_new;

public class HRSTest {
	
	abstract class Employee{
		String name;
		int salary;
		public abstract void calcSalary();
		public abstract void calcBonus();
	}
	
	class Salesman extends Employee{
		public void calcSalary() {
			System.out.println("Salesman�޿� = �⺻�� + �Ǹż���");
		}
		public void calcBonus() {
			System.out.println("Salesman���ʽ� = �⺻�� * 12 * 4");
		}
	}
	
	class Consultant extends Employee{
		public void calcSalary() {
			System.out.println("Consultant�޿� = �⺻�� + ������ Ư������");
		}
		public void calcBonus() {
			System.out.println("Consultant���ʽ� = �⺻�� * 12 *6");
		}
	}

	public static void main(String[] args) {
		
	}

}
