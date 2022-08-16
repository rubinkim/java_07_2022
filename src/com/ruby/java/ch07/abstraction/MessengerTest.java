package com.ruby.java.ch07.abstraction;

public class MessengerTest {

	public static void main(String[] args) {
		
		IPhoneMessenger iphone = new IPhoneMessenger();
		GalaxyMessenger galaxy = new GalaxyMessenger();
		
		System.out.println("�޽��� �ּ� ���� ũ��" + Messenger.MIN_SIZE);
		System.out.println("�޽��� �ִ� ���� ũ��" + Messenger.MAX_SIZE);
		
		iphone.getMessage();
		iphone.setMessage("hello");
		iphone.clearMessage();
		
		galaxy.getMessage();
		galaxy.setMessage("hi");
		galaxy.changeKeyboard();
		galaxy.fileDownload();
		galaxy.fileUpload();
	}
}
