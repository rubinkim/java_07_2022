package edu;

public class Page_120 {

	public static void main(String[] args) {
		
		// 10���� 1���� �������� ����ϴ� �ݺ����� �����Ͻÿ�
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		
		System.out.println();
		
		// 1���� 10���� ��� ���� ���� sum������ �����ϴ� �ݺ����� �����Ͻÿ�
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
			System.out.println(sum);
		}
		
		System.out.println();
		
		// 2���� 10������ 2�� ����� ����ϴ� �ݺ����� �����Ͻÿ�
		for(int i=0; i<=10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
