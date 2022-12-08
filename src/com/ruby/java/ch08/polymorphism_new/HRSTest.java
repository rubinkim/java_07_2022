package com.ruby.java.ch08.polymorphism_new;

abstract class Employee extends Object{
	
	public Employee() {
		
	}
	
	public Employee(String name) {
		this.name = name;
	}
	
	String name;
	int salary;
	public abstract void calcSalary();
	public abstract void calcBonus();
	
	public String toString_new() {
		return this.name + "�� �ּҰ��� " + this.toString() + "�̴�.";
	}
}
	
class Salesman extends Employee{
	
	public Salesman() {
		
	}
	
	public Salesman(String name) {
		super(name);
	}
	
	public void calcSalary() {
		System.out.println("Salesman�޿� = �⺻�� + �Ǹż���");
	}
	public void calcBonus() {
		System.out.println("Salesman���ʽ� = �⺻�� * 12 * 4");
	}
}
	
class Consultant extends Employee{
	
	public Consultant() {
		
	}
	
	public Consultant(String name) {
		this.name = name;
	}
	
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
	
	public Director() {
		
	}
	
	public Director(String name) {
		this.name = name;
	}
	
	public void calcBonus() {
		System.out.println("Director���ʽ� = �⺻�� * 12 * 12");
	}
}
	
public class HRSTest{

	// ���α׷��� �����ϸ� main()�޼��尡 ����Ǵµ� �̾ȿ� ���� ������� ���� �޼��尡 
	// �ִٸ� �翬�� ������ �߻��� ���̱� ������ ���α׷� ���۽� main()�޼��庸�� ����
	// �޸��� code������ �����ǵ��� static���� ��������� �ϴ� ���̴�!!!
	public static void calcTax(Employee e) {
		System.out.println(e + "�� �ҵ漼�� ����Ѵ�.");
	}
	
	public static void main(String[] agrs) {
		Salesman s = new Salesman("s");
		Consultant c = new Consultant("c");
		Director d = new Director("d");
		
		calcTax(s);
		calcTax(c);
		calcTax(d);
		
		System.out.println();
		
		System.out.println(s.toString_new());
		System.out.println(c.toString_new());
		System.out.println(d.toString_new());
		System.out.println();
		
		Salesman s2 = s;
		System.out.println(s2.toString());
		
		if(s.equals(s2)) {System.out.println("�Ѵ� ���� ��ü�̴�.");}
		else {System.out.println("���� �ٸ� ��ü�̴�.");
		}
		System.out.println();
		
		Salesman ss1 = new Salesman();
		Employee ss2 = new Salesman();
		Object   ss3 = new Salesman();
		
		Director dd0 = new Director();
		Manager  dd1 = new Director();
		Employee dd2 = new Director();
		Object   dd3 = new Director();
		
		Object arr[] = new Object[] {ss1,ss2,ss3,dd0,dd1,dd2,dd3};
		
	}
}
	

	


