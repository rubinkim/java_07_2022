package com.ruby.java.test2;

public class ThisTest2 {
	
	private String name;
	private int age;
	
	public ThisTest2() {
		this("±èÇÑ¿ë");		
	}
	
	public ThisTest2(String name) {
		this(name, 64);
	}
	
	public ThisTest2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + " : " + age;
	}
	
	public static void main(String[] args) {
		ThisTest2 tt1 = new ThisTest2();
		ThisTest2 tt2 = new ThisTest2("ÃµÁö¿µ", 47);
		ThisTest2 tt3 = new ThisTest2("±è±â¿ø", 47);
		
		System.out.println(tt1.toString());
		System.out.println(tt2.toString());
		System.out.println(tt3.toString());
		
		System.out.println('\n');
		
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
