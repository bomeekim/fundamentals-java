package assignment;

import java.util.Arrays;

/**
 * Created by bomikim on 2018. 3. 5. 오후 4:03:08
 */
public class Prob4 {

	/*
		int[] num = new int[6]
		배열 num에 정수 1~45
		사이의 난수를
		집어넣는다.중복제거한다.정렬후 화면에 출력한다.
	*/

	public static void main(String[] args) {

		int[] num = new int[6];
		
		for (int i=0; i<num.length; i++) {
			num[i] = (int) (Math.random() * 45) + 1;
			
			for (int j=0; j<i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}
		}
		
		// solution1
		Arrays.sort(num);
		System.out.println("solution 1 : " + Arrays.toString(num));
		
		// solution2
		for (int i=0; i<num.length-1; i++) {
			for (int j=i+1; j<num.length; j++) {
				
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		System.out.println("solution 2 : " + Arrays.toString(num));
	}

}
