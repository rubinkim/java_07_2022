package com.ruby.java.ch07.abstraction_new2;

public interface Messenger {
	
	public static final int MIN_SIZE = 1;
	public static final int MAX_SIZE = 104857600;
	
	public abstract String getMessage();
	public abstract void setMessage(String msg);
	
	public default void setLogin(boolean login) {
		if(login) {System.out.println("로그인 처리");
		} 
		else {System.out.println("로그아웃 처리");
		}
	}
	
	public static void getConnection() {
		System.out.println("network에 연결");
	}
}
