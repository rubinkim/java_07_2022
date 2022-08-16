package com.ruby.java.ch07.abstraction;

public interface Messenger {

	public static final int MIN_SIZE = 1;
	public static final int MAX_SIZE = 104857600;
	
	public abstract String getMessage();
	
	public abstract void setMessage(String msg);
	
	public default void setLogin(boolean login) {
//		log();
		if(login) System.out.println("로그인 처리합니다.");
		else System.out.println("로그아웃 처리합니다.");
	}
	
	public static void getConnection(){
		System.out.println("network에 연결합니다.");
	}
	
	// java9부터 추가되었으므로 java 8인 현 java에서는 private 메서드를 선언할  수 없다.
//	private void log() {
//		System.out.println("start job!");
//	}
}
