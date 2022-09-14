package edu;

public class Test23 {

	public static void main(String[] args) {

		char grade = 'B';
		
		switch(grade) {
		case 'A': System.out.println("90점 이상"); break;
		case 'B': System.out.println("80점 이상"); break;
		case 'C': System.out.println("70점 이상"); break;
		case 'D': System.out.println("60점 이상"); break;
		default: System.out.println("60점 이하입니다."); break;
		}
		
		if(grade == 'A') System.out.println("90점 이상입니다.");
		else if(grade == 'B') System.out.println("80점대 입니다.");
		else if(grade == 'C') System.out.println("70점대 입니다.");
		else if(grade == 'D') System.out.println("60점대 입니다.");
		else System.out.println("60점 이하입니다.");
	}
}
