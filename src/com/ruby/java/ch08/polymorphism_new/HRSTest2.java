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

public class HRSTest2 {

	public static void main(String[] args) {

	}

}
