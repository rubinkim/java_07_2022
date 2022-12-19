package com.ruby.java.ch08.polymorphism_new;

abstract class Employee extends Object{
	// constructor ����
	public Employee() {		
	}
	public Employee(String name) {
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

class Salesman extends Employee{
	// constructor ����
	public Salesman() {
	}
	public Salesman(String name) {
		super(name);
	}
	
	// �߻�޼��� �����ϱ�
	public void calcSalary() {
		System.out.println("Salesman�޿� = �⺻�� + �Ǹż���");
	}
	public void calcBonus() {
		System.out.println("Salesman���ʽ� = �⺻�� * 12 * 4");
	}
}

public class HRSTest2 {

	public static void main(String[] args) {

	}

}
