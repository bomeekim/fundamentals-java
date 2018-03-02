package day004;

import java.util.Arrays;

/**
 * Created by bomikim on 2018. 3. 2. 오후 2:38:34
 */
public class P194 {

	public static void main(String[] args) {
		int[] num = { 77, 99, 88, 40, 100 };
		
		// 위치 인덱스가 있는 collection에서 사용
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + "   ");
		}
		
		System.out.println();
		System.out.println("===================================");
		
		// 위치 인덱스가 없는 set 과 같은 collection 에서 사용
		for (int n : num) {
			System.out.print(n +  "   ");
		} 
		
		System.out.println();
		System.out.println("===================================");
		
		int[] temp = new int[num.length * 2];
		
		// 배열 복사
		System.arraycopy(num, 0, temp, 0, num.length);
		
		for (int data : temp) {
			System.out.print(data + "   ");
		}
		
		System.out.println();
		System.out.println("===================================");
		
		String[] name = { "홍길동", "박보검", "고길동" };
		System.out.println("name length => " + name.length);
		
		for (String s : name) {
			System.out.println(s.charAt(0) + "**");
		}
		
		int[] score = null; // score. X
		score = new int[0]; // score. O
		
//		System.out.println(Arrays.toString(num));
	}

}
