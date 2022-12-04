package com.ruby.java.ch08.polymorphism_new;

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
	
abstract class Manager extends Employee{
	public void calcSalary() {
		System.out.println("Manager�޿� = �⺻�� + ����������");
	}
}
	
class Director extends Manager{
	public void calcBonus() {
		System.out.println("Director���ʽ� = �⺻�� * 12 * 12");
	}
}
	
public class HRSTest{
	
	public static void calcTax(Employee e) {
		System.out.println(e + "�� �ҵ漼�� ����Ѵ�.");
	}
	
	public static void main(String[] agrs) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();
		
		calcTax(s);
		calcTax(c);
		calcTax(d);
	}
}
	

	


