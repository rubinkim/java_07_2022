package com.ruby.java.test2;

public class ChangeableLengthArgumentTest {
	// �������� ���ڸ� ���޹޴� �Ű������� �ִ� �޼��� ����
	static void test1(int ... v) {
		System.out.print("�Ű������� ������ " + v.length + "���̰� ");
		System.out.print("���޹��� ���ڴ� ");
		for(int x : v) {
			System.out.print(x + " ");
		}
		System.out.print("�̴�.");
		System.out.println();
	}
	
	// �������� ���ڸ� ���޹޴� �Ű������� ���Ҿ �Ϲ����ڵ� ���޹޴� ���ռ����� ���
	static void test2(String name, int ... v) {
		System.out.print("ù��° ���޹��� ���ڴ� " + name + "�̰�.");
		System.out.print("�ι�° ���޹��� ���ڴ� ");
		for(int x : v) {
			System.out.print(x + " ");
		}
		System.out.print("�̴�.");
		System.out.println();
	}
	
	public static void main(String[] args) {
		test1(1);
		test1(1,2);
		test1(1,2,3);
		
		System.out.println();
		
		test2("���ѿ�", 1);
		test2("õ����", 1,2);
		test2("����", 1,2,3);
	}
}
