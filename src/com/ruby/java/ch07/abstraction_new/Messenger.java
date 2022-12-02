package com.ruby.java.ch07.abstraction_new;

public interface Messenger {

	public static final int MIN_SIZE = 1;
	public static final int MAX_SIZE = 104857600;
	
	public abstract String getMessage();
	public abstract void setMessage(String msg);

	public default void setLogin(boolean login) {

		if(login) {
			System.out.println("�α��� ó���մϴ�.");
		} else {
			System.out.println("�α׾ƿ� ó���մϴ�.");
		}
	}
	
	public static void getConnection() {
		System.out.println("network�� �����մϴ�.");
	}

	}

