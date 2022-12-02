package com.ruby.java.ch07.abstraction_new2;

public class IPhoneMessenger implements Messenger {
	
	public String getMessage() {
		return "iphone";
	}
	
	public void setMessage(String msg) {
		System.out.println("iPhone에서 메시지를 설정 : " + msg);
	}
	
	public void clearMessage() {
		System.out.println("좌우로 흔들어 문자열을 지운다.");
	}
}
