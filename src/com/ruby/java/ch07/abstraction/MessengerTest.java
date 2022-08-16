package com.ruby.java.ch07.abstraction;

public class MessengerTest {

	public static void main(String[] args) {
		
		IPhoneMessenger iphone = new IPhoneMessenger();
		GalaxyMessenger galaxy = new GalaxyMessenger();
		
		System.out.println("�޽��� �ּ� ���� ũ��" + Messenger.MIN_SIZE);
		System.out.println("�޽��� �ִ� ���� ũ��" + Messenger.MAX_SIZE);
		System.out.println();
		
		iphone.getMessage();
		iphone.setMessage("hello");
		iphone.clearMessage();
		iphone.draw_textBox();
		iphone.draw_submitButton();
		System.out.println();
		
		galaxy.getMessage();
		galaxy.setMessage("hi");
		galaxy.changeKeyboard();
		galaxy.fileDownload();
		galaxy.fileUpload();
	}
}
