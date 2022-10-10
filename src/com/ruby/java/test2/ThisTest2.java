package com.ruby.java.test2;

public class ThisTest2 {
	
	private String name;
	private int age = 0;
	
	public ThisTest2() {
		this("김한용");		
	}
	
	public ThisTest2(String name) {
		this(name, 64);
	}
	
	public ThisTest2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		ThisTest2 tt1 = new ThisTest2();
		ThisTest2 tt2 = new ThisTest2("천지영");
		ThisTest2 tt3 = new ThisTest2("김기원", 47);
		
		System.out.println("tt1의 name : " + tt1.name + "   tt1의 age : " + tt1.age);
		System.out.println("tt2의 name : " + tt2.name + "   tt2의 age : " + tt2.age);
		System.out.println("tt3의 name : " + tt3.name + "   tt3의 age : " + tt3.age);
	}

}
