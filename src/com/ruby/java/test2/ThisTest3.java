package com.ruby.java.test2;

public class ThisTest3 {

	public static void main(String[] args) {
		// 알파벳 26자를 배열에 저장하고 출력하기
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
	}

}
