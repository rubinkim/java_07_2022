package com.ruby.java.test2;

public class ThisTest2 {
	
	private String name;
	private int age = 0;
	
	public ThisTest2() {
		this("���ѿ�");		
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
		ThisTest2 tt2 = new ThisTest2("õ����");
		ThisTest2 tt3 = new ThisTest2("����", 47);
		
		System.out.println("tt1�� name : " + tt1.name + "   tt1�� age : " + tt1.age);
		System.out.println("tt2�� name : " + tt2.name + "   tt2�� age : " + tt2.age);
		System.out.println("tt3�� name : " + tt3.name + "   tt3�� age : " + tt3.age);
	}

}
