package com.ruby.java.ch08.polymorphism_new;

abstract class Employee_new extends Object{
	// constructor 생성
	public Employee_new() {		
	}
	public Employee_new(String name) {
		this.name = name;
	}
	
	// 필드 생성
	String name;
	int salary;
	
	// 추상메서드 생성
	public abstract void calcSalary();
	public abstract void calcBonus();
	public String toString_new() {
		return this.name + "의 주소값은 " + this.toString() + "이다.";
	}
}

class Salesman_new extends Employee_new{
	// constructor 생성
	public Salesman_new() {
	}
	public Salesman_new(String name) {
		super(name);
	}
	
	// 필드 추가
	int annual_sales;  // 연간 판매 실적
	
	// 추상메서드 구현하기
	public void calcSalary() {
		System.out.println("Salesman급여 = 기본급 + 판매수당");
	}
	public void calcBonus() {
		System.out.println("Salesman보너스 = 기본급 * 12 * 4");
	}
}

class Consultant_new extends Employee_new{
	// constructor 생성
	public Consultant_new() {
	}
	public Consultant_new(String name) {
		this.name = name;
	}
	
	// 필드 추가
	int num_project;    // 컨설팅 참여 수
	
	// 추상메서드 구현하기
	public void calcSalary() {
		System.out.println("Consultant급여 = 기본급 + 컨설팅 특별수당");
	}
	public void calcBonus() {
		System.out.println("Consultant보너스 = 기본급 * 12 * 6 ");
	}
}

class Manager_new extends Employee_new{
	//constructor 생성
	public Manager_new() {
	}
	public Manager_new(String name) {
		this.name = name;
	}
	// 필드 추가
	int num_teams;      // 관리 팀 수
	
	// 추상메서드 구현하기
	public void calcSalary() {
		System.out.println("Manager급여 = 기본급 + 팀성과수당");
	}
	public void calcBonus() {
		System.out.println("Manager보너스 = 기본급 * 5 * 2");
	}
}

class Director_new extends Manager_new{
	// constructor 생성
	public Director_new() {
	}
	public Director_new(String name) {
		this.name = name;
	}
	
	// 추상메서드 구현하기
	public void calcBonus() {
		System.out.println("Director보너스 = 기본급 * 12 * 12");
	}
}

public class HRSTest2 {
	// calcTax()메서드 생성
	public static void calcTax(Employee_new e) {
		if(e instanceof Salesman_new) {
			Salesman_new s = (Salesman_new) e;
			s.annual_sales = 65000000;
			System.out.println("Salesman입니다." + s.annual_sales);
		} else if(e instanceof Manager_new) {
			Manager_new m = (Manager_new) e;
			m.num_teams = 5;
			System.out.println("Manager입니다." + m.num_teams);
		} else if(e instanceof Consultant_new) {
			Consultant_new c = (Consultant_new) e;
			c.num_project = 35;
			System.out.println("Consutant입니다." + c.num_project);
		} else {
			System.out.println("Employee입니다.");
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
