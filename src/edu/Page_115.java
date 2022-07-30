package edu;

import java.util.Scanner;

public class Page_115 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나라명을 입력하세요 : ");
		String nation = sc.next();
		
		switch(nation) {
		case "KOREA":
		case "JAPAN":
		case "CHINA":
			System.out.println(nation + "은(/는) 아시아 국가입니다.");
			break;
		case "GREAT BRITAIN":
		case "GERMANY":
		case "FRANCE":
			System.out.println(nation + "은(/는) 유럽 국가입니다.");
			break;
		case "USA":
		case "CANADA":
		case "MEXICO":
			System.out.println(nation + "은(/는) 아메리카입니다.");
			break;
		default: System.out.println(nation + "은(/는) 아시아/유럽/아메리카에 속해 있지 않습니다.");
		}
	}

}
