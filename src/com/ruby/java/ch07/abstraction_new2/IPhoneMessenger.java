package com.ruby.java.ch07.abstraction_new2;

public class IPhoneMessenger implements Messenger {
	
	public String getMessage() {
		return "iphone";
	}
	
	public void setMessage(String msg) {
		System.out.println("iPhone���� �޽����� ���� : " + msg);
	}
	
	public void clearMessage() {
		System.out.println("�¿�� ���� ���ڿ��� �����.");
	}
}
