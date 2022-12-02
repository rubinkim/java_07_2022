package com.ruby.java.ch07.abstraction_new2;

public class MessengerTest {

	public static void main(String[] args) {
		IPhoneMessenger iphone = new IPhoneMessenger();
		
		System.out.println("메신저 최소문자 크기 : " + Messenger.MIN_SIZE);
		System.out.println("메신저 최대문자 크기 : " + Messenger.MAX_SIZE);
		
		System.out.println(iphone.getMessage());
		iphone.clearMessage();
		iphone.setMessage("bueno");
		
		GalaxyMessenger galaxy = new GalaxyMessenger();
		System.out.println(galaxy.getMessage());
	}
}
