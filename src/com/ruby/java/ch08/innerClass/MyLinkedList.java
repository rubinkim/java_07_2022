package com.ruby.java.ch08.innerClass;

public class MyLinkedList {
	
	private Node head = null;
	
	private class Node{
		private String data;
		private Node link;
		
		public Node(String data) {
			this.data = data;
		}
	}
	
	public void add(String data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			System.out.println("이번의 data값은 :" + head.data + " 이번의 link값은 : " + head.link);
		} else {
			Node next = head;
			while(next.link !=null) {
				System.out.println("이번의 data값은 : " + next.data + " 이번의 link값은 : " + next.link);
				next = next.link;
			}
			next.link = newNode;
		}
	}

	public void print() {
		if(head == null) {
			System.out.println("등록된 데이터가 없습니다.");
		} else {
			System.out.println("등록된 데이터가 다음과 같습니다.");
			Node next = head;
			while(next != null) {
				System.out.println(next.data);
				next = next.link;
			}
		}
	}

}
