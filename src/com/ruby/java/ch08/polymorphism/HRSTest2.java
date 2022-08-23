package com.ruby.java.ch08.polymorphism;

public class HRSTest2 {
	
	public static void calcTax(Employee e) {
		if(e instanceof Salesman) {
			Salesman s = (Salesman) e;
			s.annual_sales = 6500000;
			System.out.println("Salesman�Դϴ�." + s.annual_sales);
		} else if(e instanceof Manager) {
			Manager m = (Manager) e;
			m.num_team = 5;
			System.out.println("Manager�Դϴ�." + m.num_team);
		} else if (e instanceof Consultant) {
			Consultant c = (Consultant) e;
			c.num_project = 35;
			System.out.println("Consultant�Դϴ�." + c.num_project);
		} else {
			System.out.println("Employee�Դϴ�.");
		}
	}

	public static void main(String[] args) {
		
		Salesman s = new Salesman();
		Manager m = new Manager();
		Consultant c = new Consultant();
		
		calcTax(s);
		calcTax(m);
		calcTax(c);
	}
}
