package com.ruby.java.ch08.polymorphism_new;

abstract class Employee{
	String name;
	int salary;
	public abstract void calcSalary();
	public abstract void calcBonus();
}
	
class Salesman extends Employee{
	public void calcSalary() {
		System.out.println("Salesman급여 = 기본급 + 판매수당");
	}
	public void calcBonus() {
		System.out.println("Salesman보너스 = 기본급 * 12 * 4");
	}
}
	
class Consultant extends Employee{
	public void calcSalary() {
		System.out.println("Consultant급여 = 기본급 + 컨설팅 특별수당");
	}
	public void calcBonus() {
		System.out.println("Consultant보너스 = 기본급 * 12 *6");
	}
}
	
abstract class Manager extends Employee{
	public void calcSalary() {
		System.out.println("Manager급여 = 기본급 + 팀성과수당");
	}
}
	
class Director extends Manager{
	public void calcBonus() {
		System.out.println("Director보너스 = 기본급 * 12 * 12");
	}
}
	
public class HRSTest{
	
	public static void calcTax(Employee e) {
		System.out.println(e + "의 소득세를 계산한다.");
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
	

	


