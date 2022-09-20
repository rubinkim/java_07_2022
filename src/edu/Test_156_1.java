package edu;

public class Test_156_1 {

	public static void main(String[] args) {
		// 정수형 배열에 저장된 점수들의 합계,평균,최댓값,최솟값을 구해보자
		int[] score = {86, 73, 83, 91, 100, 52, 80};
		int sum = 0;
		double avg = 0.0;
		int max = 0;
		int min = 999;
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
			if(max < score[i]) max = score[i];
			if(min > score[i]) min = score[i];
		}	
		avg = sum / score.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최솟값 : " + min);
		System.out.println("최댓값 : " + max);
		
	}

}
