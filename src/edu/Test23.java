package edu;

public class Test23 {

	public static void main(String[] args) {

		char grade = 'B';
		
		switch(grade) {
		case 'A': System.out.println("90�� �̻�"); break;
		case 'B': System.out.println("80�� �̻�"); break;
		case 'C': System.out.println("70�� �̻�"); break;
		case 'D': System.out.println("60�� �̻�"); break;
		default: System.out.println("60�� �����Դϴ�."); break;
		}
		
		if(grade == 'A') System.out.println("90�� �̻��Դϴ�.");
		else if(grade == 'B') System.out.println("80���� �Դϴ�.");
		else if(grade == 'C') System.out.println("70���� �Դϴ�.");
		else if(grade == 'D') System.out.println("60���� �Դϴ�.");
		else System.out.println("60�� �����Դϴ�.");
	}
}
