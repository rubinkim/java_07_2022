package com.ruby.java.ch07.abstraction;

abstract class Employee{
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
}

class Salesman extends Employee{
	public void calcSalary() {
		System.out.println("Salesman �޿� = �⺻�� + �Ǹ� ����");
	}
	public void calcBonus() {
		System.out.println("Salesman ���ʽ� = �⺻��  * 12 * 4");
	}
}

abstract class Manager extends Employee{
	public void calcSalary() {
		System.out.println("Manager �޿� = �⺻�� + �� ���� ����");
	}
}

class Consultant extends Employee{
	public void calcSalary() {
		System.out.println("Consultant �޿� = �⺻�� + ������ Ư�� ����");
	}
	public void calcBonus() {
		System.out.println("Consultant ���ʽ� = �⺻�� * 12 * 2");
	}
}

class Director extends Manager{
	public void calcBonus() {
		System.out.println("Director ���ʽ� = �⺻�� * 12 * 6");
	}
}

public class HRSTest {

	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		//Manager m = new Manager(); ManagerŬ������ �߻�Ŭ������ �ν��Ͻ��� ������ �� ����.
		Director d = new Director();
		
		s.calcBonus();
		c.calcBonus();
		d.calcBonus();
	}

}
