package edu;

public class Page_164 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int num = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		
//arr어래이에서 diagonal에 위치한 값들의 합을 구하시오.
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i == j) {
					sum += arr[i][j];
				}
			}
		}
		System.out.println("대각선 합계 : " + sum);
		
//왼쪽 삼각형 순회
		int left_lower_sum = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i >= j) {
					left_lower_sum += arr[i][j];
				}
			}
		}
		System.out.println("왼쪽 아래 삼각형 합계 : " + left_lower_sum);
	}

}
