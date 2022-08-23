package com.ruby.java.ch08.polymorphism;

abstract class Employee{
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
}

class Salesman extends Employee{
	
	int annual_sales; // ���� �Ǹ� ����
	
	public void calcSalary() {
		System.out.println("Salesman �޿� = �⺻�� + �Ǹ� ����");
	}
	public void calcBonus() {
		System.out.println("Salesman ���ʽ� = �⺻��  * 12 * 4");
	}
}

class Manager extends Employee{
	
	int num_team; // ���� �� ��
	
	public void calcSalary() {
		System.out.println("Manager �޿� = �⺻�� + �� ���� ����");
	}
	public void calcBonus() {
		System.out.println("Manage ���ʽ� = �⺻�� * 12 * 6");
	}
}

class Consultant extends Employee{
	
	int num_project; // ������ ���� ��
	
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
		
		Salesman ss1 = new Salesman();
		Employee ss2 = new Salesman();
		Object ss3 = new Salesman();
		
		Object m1 = new Manager();
		Employee m2 = new Manager();
		Manager m3 = new Manager();
		
		Object arr[] = new Object[6];
		arr[0] = ss1;
		arr[1] = ss2;
		arr[2] = ss3;
		arr[3] = m1;
		arr[4] = m2;
		arr[5] = m3;
		
		System.out.printf("\n\n");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
