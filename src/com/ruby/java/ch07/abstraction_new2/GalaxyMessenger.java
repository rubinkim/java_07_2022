package com.ruby.java.ch07.abstraction_new2;

public class GalaxyMessenger {
	
	public String getMessage() {
		return "galaxy";
	}
	
	public void setMessage(String msg) {
		System.out.println("galaxy에서 메시지를 설정 : " + msg);
	}
	
	public void changeKeyboard() {
		System.out.println("키보드 아이콘 터치후 키보드 변경한다.");
	}
}
