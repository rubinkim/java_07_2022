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

public class HRSTest2 {

	public static void main(String[] args) {

	}

}
