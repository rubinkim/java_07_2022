package com.ruby.java.ch07.abstraction_new;

public interface Messenger {

	public static final int MIN_SIZE = 0;
	public static final int MAX_SIZE = 104857600;
	
	public abstract String getMessage();
	public abstract void setMessage(String msg);
	
	
	
}
