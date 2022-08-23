package com.ruby.java.ch08.polymorphism;

abstract class Employee{
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
}

class Salesman extends Employee{
	
	int annual_sales; // 연간 판매 실적
	
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판매 수당");
	}
	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본급  * 12 * 4");
	}
}

class Manager extends Employee{
	
	int num_team; // 관리 팀 수
	
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}
	public void calcBonus() {
		System.out.println("Manage 보너스 = 기본급 * 12 * 6");
	}
}

class Consultant extends Employee{
	
	int num_project; // 컨설팅 참여 수
	
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	}
	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
	}
}

class Director extends Manager{
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 6");
	}
}

public class HRSTest {
	
	public static void calcTax(Employee e) {
		System.out.println("소득세를  계산합니다.");
	}

	public static void main(String[] args) {
		
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();
		
		s.calcBonus();
		c.calcBonus();
		d.calcBonus();
		
		System.out.println();
		
		calcTax(s);
		calcTax(c);
		calcTax(d);
		
		System.out.println();
		
		// toString()메서드는 "클래스이름@인스턴스ID값을 반환합니다.
		System.out.println(s.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
		
		System.out.println();
		
		// 객체.equals(다른 객체)메서드는 양객체가 같은 객체인지 아닌지 bool을 반환합니다.
		if(s.equals(c)) {
			System.out.println("s와 c는 동일한 객체입니다");
		}
		else {
			System.out.println("s와 c는 서로 다른 객체입니다.");
		}
		
		System.out.println();
		
		Salesman s2 = s;
		System.out.println(s2.toString());
		
		if(s.equals(s2)) {
			System.out.println("s와 s2는 동일한 객체입니다.");
		}
		else {
			System.out.println("s와 s2는 서로 다른 객체입니다.");
		}
		
		Salesman ss1 = new Salesman();
		Employee ss2 = new Salesman();
		Object ss3 = new Salesman();
		
		Object m1 = new Manager();
		Employee m2 = new Manager();
		Manager m3 = new Manager();
		
		Object arr[] = new Object[6];
		arr[0] = ss1;
		arr[1] = ss2;
		arr[2] = ss3;
		arr[3] = m1;
		arr[4] = m2;
		arr[5] = m3;
		
		System.out.printf("\n\n");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
