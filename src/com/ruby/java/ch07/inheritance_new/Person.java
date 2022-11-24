package com.ruby.java.ch07.inheritance_new;

public class Person {
	private String name;
	private int age;
	
	/* Person() 持失切 */
	public Person() {
		System.out.println("Person 持失切 叔薄!");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return name + " : " + age;
	}
}
