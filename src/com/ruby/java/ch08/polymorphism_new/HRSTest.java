package com.ruby.java.ch08.polymorphism_new;

abstract class Employee extends Object{
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
	
	public String toString() {
		return "�� �ּҰ��� " + super.toString() + "�̴�.";
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

	// ���α׷��� �����ϸ� main()�޼��尡 ����Ǵµ� �̾ȿ� ���� ������� ���� �޼��尡 
	// �ִٸ� �翬�� ������ �߻��� ���̱� ������ ���α׷� ���۽� main()�޼��庸�� ����
	// �޸��� code������ �����ǵ��� static���� ��������� �ϴ� ���̴�!!!
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
		
		System.out.println();
		
		System.out.println(s.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
		System.out.println();
		
		Salesman s2 = s;
		System.out.println(s2.toString());
		
		if(s.equals(s2)) {System.out.println("�Ѵ� ���� ��ü�̴�.");}
		else {System.out.println("���� �ٸ� ��ü�̴�.");
		}
	}
}
	

	


