package edu;

import java.util.Scanner;

public class Page_115 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������� �Է��ϼ��� : ");
		String nation = sc.next();
		
		switch(nation) {
		case "KOREA":
		case "JAPAN":
		case "CHINA":
			System.out.println(nation + "��(/��) �ƽþ� �����Դϴ�.");
			break;
		case "GREAT BRITAIN":
		case "GERMANY":
		case "FRANCE":
			System.out.println(nation + "��(/��) ���� �����Դϴ�.");
			break;
		case "USA":
		case "CANADA":
		case "MEXICO":
			System.out.println(nation + "��(/��) �Ƹ޸�ī�Դϴ�.");
			break;
		default: System.out.println(nation + "��(/��) �ƽþ�/����/�Ƹ޸�ī�� ���� ���� �ʽ��ϴ�.");
		}
	}

}
