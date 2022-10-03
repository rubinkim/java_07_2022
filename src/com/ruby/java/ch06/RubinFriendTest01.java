package com.ruby.java.ch06;

public class RubinFriendTest01 {

	public static void main(String[] args) {
		
		RubinFriend friend1 = new RubinFriend();
		friend1.setName("Rubin");
		friend1.setWeight(128);
		
		RubinFriend friend2 = new RubinFriend();
		//friend2 = null;
		friend2.setName("Jiyoung");
		friend2.setWeight(123);
		
		System.out.println(friend1.getName() + " : " + friend1.getWeight());
		System.out.println(friend2.getName() + " : " + friend2.getWeight());
	}

}
