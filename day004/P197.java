package day004;

import java.util.Arrays;

public class P197 {
	public static void main(String[] args) {
		int[] score = new int[5];
		
		for (int i=0; i<score.length; i++) {
			score[i] = (int) (Math.random() * 100) + 1;
		}

		// 배열 출력을 해주는 API
		System.out.println(Arrays.toString(score));
		
		// MAX값 구하기
		int max = 0;
		
		for (int i=0; i<score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
		}
		
		System.out.println(max);
		
		/*Arrays.sort(score);
		System.out.println(Arrays.toString(score));
		
		max = score[4];
		System.out.println("max = " + max);*/
	}
}
