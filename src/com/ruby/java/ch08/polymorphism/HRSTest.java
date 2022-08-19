package com.ruby.java.ch08.polymorphism;

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
	
	public static void calcTax(Employee e) {
		System.out.println("�ҵ漼��  ����մϴ�.");
	}

	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();
		
		s.calcBonus();
		c.calcBonus();
		d.calcBonus();
		
		System.out.println();
		
		calcTax(s);
		calcTax(c);
		calcTax(d);
		
		System.out.println();
		
		// toString()�޼���� "Ŭ�����̸�@�ν��Ͻ�ID���� ��ȯ�մϴ�.
		System.out.println(s.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
		
		System.out.println();
		
		// ��ü.equals(�ٸ� ��ü)�޼���� �簴ü�� ���� ��ü���� �ƴ��� bool�� ��ȯ�մϴ�.
		if(s.equals(c)) {
			System.out.println("s�� c�� ������ ��ü�Դϴ�");
		}
		else {
			System.out.println("s�� c�� ���� �ٸ� ��ü�Դϴ�.");
		}
		
		System.out.println();
		
		Salesman s2 = s;
		System.out.println(s2.toString());
		
		if(s.equals(s2)) {
			System.out.println("s�� s2�� ������ ��ü�Դϴ�.");
		}
		else {
			System.out.println("s�� s2�� ���� �ٸ� ��ü�Դϴ�.");
		}
	}
}
