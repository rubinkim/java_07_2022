package edu;

public class Page_91 {

	public static void main(String[] args) {
		char c = 'A';
		
		System.out.printf("���� �빮�� A�� 10������ %d�̴�.\n",(int)c);
		System.out.println("���� �빮�� A�� 2������ 0b" + Integer.toBinaryString((int)c) + "�̴�.");
		System.out.printf("���� �빮�� A�� 8������ %#o�̴�.\n", (int)c);
		System.out.printf("���� �빮�� A�� 16������ %#x�̴�.\n", (int)c);
		System.out.println();
		
		c ^= (1 << 5);
	    System.out.println("���� c�� ���ĺ����� " + c + "�̴�.");
	    System.out.println("���� c�� 2������ 0b" + Integer.toBinaryString((int)c) + "�̴�.");
	    System.out.println("���� c�� 10������ " + (int)c + "�̴�.");
	    System.out.printf("���� c�� 8������ %#o�̴�.\n", (int)c);
	    System.out.printf("���� c�� 16������ %#x�̴�.\n", (int)c);
	    
		
	}
}
