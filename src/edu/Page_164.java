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
		
//arr��̿��� diagonal�� ��ġ�� ������ ���� ���Ͻÿ�.
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i == j) {
					sum += arr[i][j];
				}
			}
		}
		System.out.println("�հ� : " + sum);
	}

}
