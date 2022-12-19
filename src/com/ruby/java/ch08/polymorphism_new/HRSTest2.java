package com.ruby.java.ch08.polymorphism_new;

abstract class Employee extends Object{
	// constructor 생성
	public Employee() {		
	}
	public Employee(String name) {
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

class Salesman extends Employee{
	// constructor 생성
	public Salesman() {
	}
	public Salesman(String name) {
		super(name);
	}
	
	// 추상메서드 구현하기
	public void calcSalary() {
		System.out.println("Salesman급여 = 기본급 + 판매수당");
	}
	public void calcBonus() {
		System.out.println("Salesman보너스 = 기본급 * 12 * 4");
	}
}

class Consultant extends Employee{
	// constructor 생성
	public Consultant() {
	}
	public Consultant(String name) {
		this.name = name;
	}
	
	// 추상메서드 구현하기
	public void calcSalary() {
		System.out.println("Consultant급여 = 기본급 + 컨설팅 특별수당");
	}
	public void calcBonus() {
		System.out.println("Consultant보너스 = 기본급 * 12 * 6 ");
	}
}

abstract class Manager extends Employee{
	public void calcSalary() {
		System.out.println("Manager급여 = 기본급 + 팀성과수당");
	}
}

class Director extends Manager{
	// constructor 생성
	public Director() {
	}
	public Director(String name) {
		this.name = name;
	}
	
	// 추상메서드 구현하기
	public void calcBonus() {
		System.out.println("Director보너스 = 기본급 * 12 * 12");
	}
}

public class HRSTest2 {

	public static void main(String[] args) {

	}

}
