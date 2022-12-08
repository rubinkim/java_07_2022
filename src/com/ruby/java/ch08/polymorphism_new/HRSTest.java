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
		return this.name + "의 주소값은 " + this.toString() + "이다.";
	}
}
	
class Salesman extends Employee{
	
	public Salesman() {
		
	}
	
	public Salesman(String name) {
		super(name);
	}
	
	public void calcSalary() {
		System.out.println("Salesman급여 = 기본급 + 판매수당");
	}
	public void calcBonus() {
		System.out.println("Salesman보너스 = 기본급 * 12 * 4");
	}
}
	
class Consultant extends Employee{
	
	public Consultant() {
		
	}
	
	public Consultant(String name) {
		this.name = name;
	}
	
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
	
	public Director() {
		
	}
	
	public Director(String name) {
		this.name = name;
	}
	
	public void calcBonus() {
		System.out.println("Director보너스 = 기본급 * 12 * 12");
	}
}
	
public class HRSTest{

	// 프로그램을 시행하면 main()메서드가 실행되는데 이안에 아직 실행되지 않은 메서드가 
	// 있다면 당연히 오류가 발생할 것이기 때문에 프로그램 시작시 main()메서드보다 먼저
	// 메모리의 code영역에 생성되도록 static으로 선언해줘야 하는 것이다!!!
	public static void calcTax(Employee e) {
		System.out.println(e + "의 소득세를 계산한다.");
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
		
		if(s.equals(s2)) {System.out.println("둘다 같은 객체이다.");}
		else {System.out.println("서로 다른 객체이다.");
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
	

	


