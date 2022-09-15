package edu;

public class Page_120 {

	public static void main(String[] args) {
		
		// 10부터 1까지 역순으로 출력하는 반복문을 구성하시오
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		
		System.out.println();
		
		// 1부터 10까지 모든 수를 더해 sum변수에 저장하는 반복문을 구성하시오
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
			System.out.println(sum);
		}
		
		System.out.println();
		
		// 2부터 10까지의 2의 배수를 출력하는 반복문을 구성하시오
		for(int i=0; i<=10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
