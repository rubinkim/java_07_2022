package com.ruby.java.ch08.polymorphism_new;

abstract class Employee_new extends Object{
	// constructor ����
	public Employee_new() {		
	}
	public Employee_new(String name) {
		this.name = name;
	}
	
	// �ʵ� ����
	String name;
	int salary;
	
	// �߻�޼��� ����
	public abstract void calcSalary();
	public abstract void calcBonus();
	public String toString_new() {
		return this.name + "�� �ּҰ��� " + this.toString() + "�̴�.";
	}
}

class Salesman_new extends Employee_new{
	// constructor ����
	public Salesman_new() {
	}
	public Salesman_new(String name) {
		super(name);
	}
	
	// �ʵ� �߰�
	int annual_sales;  // ���� �Ǹ� ����
	
	// �߻�޼��� �����ϱ�
	public void calcSalary() {
		System.out.println("Salesman�޿� = �⺻�� + �Ǹż���");
	}
	public void calcBonus() {
		System.out.println("Salesman���ʽ� = �⺻�� * 12 * 4");
	}
}

class Consultant_new extends Employee_new{
	// constructor ����
	public Consultant_new() {
	}
	public Consultant_new(String name) {
		this.name = name;
	}
	
	// �ʵ� �߰�
	int num_project;    // ������ ���� ��
	
	// �߻�޼��� �����ϱ�
	public void calcSalary() {
		System.out.println("Consultant�޿� = �⺻�� + ������ Ư������");
	}
	public void calcBonus() {
		System.out.println("Consultant���ʽ� = �⺻�� * 12 * 6 ");
	}
}

class Manager_new extends Employee_new{
	//constructor ����
	public Manager_new() {
	}
	public Manager_new(String name) {
		this.name = name;
	}
	// �ʵ� �߰�
	int num_teams;      // ���� �� ��
	
	// �߻�޼��� �����ϱ�
	public void calcSalary() {
		System.out.println("Manager�޿� = �⺻�� + ����������");
	}
	public void calcBonus() {
		System.out.println("Manager���ʽ� = �⺻�� * 5 * 2");
	}
}

class Director_new extends Manager_new{
	// constructor ����
	public Director_new() {
	}
	public Director_new(String name) {
		this.name = name;
	}
	
	// �߻�޼��� �����ϱ�
	public void calcBonus() {
		System.out.println("Director���ʽ� = �⺻�� * 12 * 12");
	}
}

public class HRSTest2 {
	// calcTax()�޼��� ����
	public static void calcTax(Employee_new e) {
		if(e instanceof Salesman_new) {
			Salesman_new s = (Salesman_new) e;
			s.annual_sales = 65000000;
			System.out.println("Salesman�Դϴ�." + s.annual_sales);
		} else if(e instanceof Manager_new) {
			Manager_new m = (Manager_new) e;
			m.num_teams = 5;
			System.out.println("Manager�Դϴ�." + m.num_teams);
		} else if(e instanceof Consultant_new) {
			Consultant_new c = (Consultant_new) e;
			c.num_project = 35;
			System.out.println("Consutant�Դϴ�." + c.num_project);
		} else {
			System.out.println("Employee�Դϴ�.");
		}
	}
	
	public static void main(String[] args) {
		Salesman_new s = new Salesman_new();
		Manager_new m = new Manager_new();
		Consultant_new c = new Consultant_new();
		
		calcTax(s);
		calcTax(m);
		calcTax(c);
	}

}
