package day004;

import java.util.Scanner;

public class P172 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		
		while (flag) {
			System.out.println("등급을 처리할 점수를 입력해주세요!");
			String data = scanner.nextLine();
			
			int score = Integer.parseInt(data);
			
			String result = score >= 80 ? "합격" : "불합격";
			System.out.printf("%d [%s] %n", score, result);
		}
	}

}
