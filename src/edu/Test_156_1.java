package edu;

public class Test_156_1 {

	public static void main(String[] args) {
		// ������ �迭�� ����� �������� �հ�,���,�ִ�,�ּڰ��� ���غ���
		int[] score = {86, 73, 83, 91, 100, 52, 80};
		int sum = 0;
		double avg = 0.0;
		int max = 0;
		int min = 999;
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
			if(max < score[i]) max = score[i];
			if(min > score[i]) min = score[i];
		}	
		avg = sum / score.length;
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		System.out.println("�ּڰ� : " + min);
		System.out.println("�ִ� : " + max);
		
	}

}
