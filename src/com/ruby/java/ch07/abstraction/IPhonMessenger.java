package com.ruby.java.ch07.abstraction;

public class IPhonMessenger implements Messenger {
	
	public String getMessage() {
		return "iPhone";
	}
	
	public void setMessage(String msg) {
		System.out.println("iPhone���� �޽����� �����մϴ� : " + msg);
	}
	
	public void clearMessage() {
		System.out.println("�¿�� ���� ���ڿ��� ����ϴ�");
	}
}
