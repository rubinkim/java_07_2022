package edu;

public class Page_52_73 {

	public static void main(String[] args) {
		// 변수타입과 선언 (8가지 기본타입과 변수의 주소를 저장하는 참조타입)
		System.out.println("Hello, all of you guys!!");
		
		// 정수,논리,문자,실수,참조타입의 변수를 선언하고 초기화한다.
		byte age = 23;                  // 1byte  정수타입
		short point = 32000;            // 2bytes 정수타입
		int price = 3500000;            // 4bytes 정수타입
		long totalSales = 2147483648L;  // 8bytes 정수타입 
		
		boolean isMarried = true;       // 1bytes
		char gender = 'F';              // 2bytes, 한글자의 값
		float PI = 3.14F;               // 4bytes 실수타입
		double USDAmount = 600.50;      // 8bytes 실수타입
		String name = "Amy"; // 참조타입(메모리의 위치를 저장하는 타입)
		
		
		System.out.println(age); System.out.println(point);
		System.out.println(price); System.out.println(totalSales);
		System.out.println(isMarried); System.out.println(gender);
		System.out.println(PI); System.out.println(USDAmount);
		System.out.println(name);
		 
	}
}
