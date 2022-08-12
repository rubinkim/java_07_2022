package com.ruby.java.ch07.abstraction;

abstract class Employee{
	String name;
	int salary;
	
	public abstract void calcSalary();
}

class Salesman extends Employee{
	public void calcSalary() {
		System.out.println("Salesman �޿� = �⺻�� + �Ǹ� ����");
	}
}

class Manager extends Employee{
	public void calcSalary() {
		System.out.println("Manager �޿� = �⺻�� + �� ���� ����");
	}
}

class Consultant extends Employee{
	public void calcSalary() {
		System.out.println("Consultant �޿� = �⺻�� + ������ Ư�� ����");
	}
}

class Director extends Manager{
}

public class HRSTest {

	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Manager m = new Manager();
		
		s.calcSalary();
		c.calcSalary();
		m.calcSalary();
	}

}
