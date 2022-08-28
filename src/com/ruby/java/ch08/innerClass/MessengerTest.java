package com.ruby.java.ch08.innerClass;

public class MessengerTest {

	public static void main(String[] args) {

		Messenger test = new Messenger() {
			
			public void setMessage(String msg) {
				System.out.println("test���� �޽����� �����մϴ�. : " + msg);
			}
			
			public String getMessage() {
				return "test";
			}
		};
		
		System.out.println(test.getMessage());
		test.setMessage("Have a nice day!");
	}
}
