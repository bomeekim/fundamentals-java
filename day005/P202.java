package day005;

import java.util.Arrays;

public class P202 {
	public static void main(String[] args) {
		String[] names = { "김길동", "고길동", "홍길동", "박길동" };
		
		for (String data: names) {
			System.out.print(data + " ");
		}
		
		Arrays.sort(names);
		System.out.println("\n"+Arrays.toString(names));
		System.out.println("==================================================");
		
		int[] num = { 99, 55, 88, 77, 33 };
		System.out.println(Arrays.toString(num));
		
		Arrays.sort(num);
		
		System.out.println(Arrays.toString(num));
	}
}
