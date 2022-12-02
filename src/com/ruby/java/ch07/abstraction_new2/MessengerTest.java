package com.ruby.java.ch07.abstraction_new2;

public class MessengerTest {

	public static void main(String[] args) {
		IPhoneMessenger iphone = new IPhoneMessenger();
		
		System.out.println("�޽��� �ּҹ��� ũ�� : " + Messenger.MIN_SIZE);
		System.out.println("�޽��� �ִ빮�� ũ�� : " + Messenger.MAX_SIZE);
		
		System.out.println(iphone.getMessage());
		iphone.clearMessage();
		iphone.setMessage("bueno");
		
		GalaxyMessenger galaxy = new GalaxyMessenger();
		System.out.println(galaxy.getMessage());
	}
}
