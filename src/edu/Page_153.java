package edu;

public class Page_153 {

	public static void main(String[] args) {
//		배열에 알파벳 A부터 Z까지 저장하고 출력해보자.
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
