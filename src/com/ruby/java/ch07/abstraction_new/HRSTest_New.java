package com.ruby.java.ch07.abstraction_new;

abstract class Employee1{
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
}

class Salesman1 extends Employee1{
	public void calcSalary() {
		System.out.println("Salesman �޿� = �⺻�� + �⺻ ����");
	}
	public void calcBonus() {
		System.out.println("Salesman ���ʽ� = �⺻�� * 12 * 4");
	}
}

class Consultant extends Employee{
	public void calcSalary() {
		System.out.println("Consultant �޿� = �⺻�� + ������ Ư�� ����");
	}
	public void calcBonus() {
		System.out.println("Consultant ���ʽ� = �⺻�� * 12 * 12");
	}
}

public class HRSTest_New {

	public static void main(String[] args) {
		
		Salesman1 s = new Salesman1();
		
		s.calcSalary();
	}

}
