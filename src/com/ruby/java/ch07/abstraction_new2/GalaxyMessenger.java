package com.ruby.java.ch07.abstraction_new2;

public class GalaxyMessenger {
	
	public String getMessage() {
		return "galaxy";
	}
	
	public void setMessage(String msg) {
		System.out.println("galaxy���� �޽����� ���� : " + msg);
	}
	
	public void changeKeyboard() {
		System.out.println("Ű���� ������ ��ġ�� Ű���� �����Ѵ�.");
	}
}
