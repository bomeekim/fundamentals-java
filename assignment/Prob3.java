package assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by bomikim on 2018. 3. 2. 오후 4:07:47
 */

/*
 * == Prob1 제출하세요 ==
 * 
 * Prob1. Prob1 클래스의 main() 에서 주어진 문자열 배열을 생성하여 배열의 내용을 역순으로 출력하할 수 있도록 main
 * 메서드를 작성하세요.
 * 
 * - 문자열 배열의 내용을 역순으로 출력하되 각 문자열 또한 역순으로 출력한다. - 입력으로 주어진 문자열 배열의 예 : {
 * "Java Programming" , "JDBC", "Oracle10g", "JSP/Servlet" }
 * 
 * 처리 결과의 예 : 아래 참고. gnimmargorP avaJ CBDJ g01elcarO telvreS/PSJ
 */

public class Prob3 {
	public static void main(String[] args) {
		Prob1();

		System.out.println("msg : " + exam1());
		
		System.out.println();
		System.out.println("sum : " + exam2());
		
		System.out.println();
		System.out.println("num : " + exam3());
	}

	public static void Prob1() {
		String[] str = { "Java Programming", "JDBC", "Oracle10g", "JSP/Servlet" };

		// solution 1
		StringBuffer[] result = new StringBuffer[str.length];

		System.out.println("Solution #1. StringBuffer 사용");
		System.out.println("=================================");

		for (int i = 0; i < str.length; i++) {
			StringBuffer s = new StringBuffer(str[i]);
			result[i] = s.reverse();

			System.out.println(result[i]);
		}

		System.out.println();

		// solution 2

		System.out.println("Solution #2. for문 사용");
		System.out.println("=================================");

		for (int i = 0; i < str.length; i++) {
			for (int j = str[i].length() - 1; j >= 0; j--) {

				System.out.print(str[i].charAt(j) + "");
			}
			System.out.println();
		}
	}

	/* 예제) 문자열 참조변수 msg 가 "yes" 일때 true 인 조건식 */
	public static boolean exam1() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("메시지를 입력하세요! ex) yes or no");
		String msg = scanner.nextLine();
				
		if (msg.equals("yes"))
			return true;
		else
			return false;
	}

	/* 예제) arr 배열 에 담긴 모든 값을 더하는 프로그램을 완성하시오. */
	public static int exam2() {
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;
		
		// TODO arr 배열 에 담긴 모든 값을 더하는 프로그램을 완성
		
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}

		return sum;
	}


	/*예제) 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때 
      몇까지 더해야 총합이  100  이상이 되는지 ?*/
	public static int exam3() {
		
		int sum = 0;
		int num = 1;
		
		while (sum != 100) {
			if (num % 2 == 1) {
				sum += num;
			} else if (num % 2 == 0) {
				sum -= num;
			}
			
			num++;
		}
		
		return num;
	}
}
