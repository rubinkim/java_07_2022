package edu;

public class Test_155_1 {

	public static void main(String[] args) {
		// ���ĺ� A���� Z���� �����ϰ� ����ϱ�
		char letter = 'A';
		
		System.out.println(letter);
		System.out.println(letter+0);
		System.out.println((char)(letter+1));
		System.out.println();
		
		char[] alphabet = new char[26];
		
		for(int i=0; i<alphabet.length; i++) {
			alphabet[i] = (char)(letter + i);
		}
		
		System.out.println(alphabet);
		System.out.println();
		
		for(char c : alphabet) {
			System.out.print(c + " ");
		}
		System.out.println();
	}
}
