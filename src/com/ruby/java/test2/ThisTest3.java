package com.ruby.java.test2;

public class ThisTest3 {

	public static void main(String[] args) {
		// ���ĺ� 26�ڸ� �迭�� �����ϰ� ����ϱ�
		char letter = 'A';
		char[] alphabet = new char[26];
		
		System.out.println(letter+1);
		System.out.println((char)(letter+1));
		
		for(int i=0; i<alphabet.length; i++) {
			alphabet[i] = (char)(letter + i);
		}
		System.out.println(alphabet);
		
		for(char c : alphabet) {
			System.out.print(c);
		}
		
		System.out.println();
		
		// �迭�� ����� �������� �հ�,���,�ְ�,���� ���� ���ϱ�
		int[] score = {93,100,72,91,87};
		int sum = 0;
		int max = 0;
		int min = 999;
		float avg = 0.0f;
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
			if(max < score[i]) max = score[i];
			if(min > score[i]) min = score[i]; 
		}
		
		avg = sum / score.length;
		
		System.out.println("���� �հ�� : " + sum);
		System.out.println("���� ����� : " + avg);
		System.out.println("�ְ� ������ : " + max);
		System.out.println("���� ������ : " + min);
		
		// ����� �Ű����� �̿��ϱ�
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
