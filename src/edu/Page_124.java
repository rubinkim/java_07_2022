package edu;

public class Page_124 {

	public static void main(String[] args) {
		//for loop : ����� ����� �ʱ�ȭ,�ݺ����ǽ�,������,���๮
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		System.out.println("OK");
		System.out.println();
		
		//while loop : ���������� �ʱ�ȭ,�ݺ����ǹ�,���๮,������
		int i = 0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("OK");
		System.out.println();
		
		//do while loop : ���������� �ʱ�ȭ,���๮,������,�ݺ����ǹ�
		int j = 0;
		do {
			System.out.println(j);
			j++;
		}
		while(j<10);
		System.out.println("OK");
	}
}
