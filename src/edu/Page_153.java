package edu;

public class Page_153 {

	public static void main(String[] args) {
//		�迭�� ���ĺ� A���� Z���� �����ϰ� ����غ���.
		char letter = 'A';
		//int[] unicode = new int[26];
		char[] alphabet = new char[26];
		
		for(int i=0; i<alphabet.length; i++) {
			alphabet[i] = (char)(letter + i);
		}
		
		System.out.println(alphabet);
		
		for(char c : alphabet) {
			System.out.println(c + " : " + (int)c);
		}
	}

}
