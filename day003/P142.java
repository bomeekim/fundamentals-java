package day003;

import java.util.Scanner;

public class P142 {

	public static void main(String[] args) {
		System.out.println("성적처리");

		String name = null;
		int score = 0;
		char grade = ' '; // 'A' 'B' 'C'
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성적처리를 하려면 y, 끝내려면 q를 입력해주세요.");
		
		String str = sc.nextLine();
		
		if (str.equals("q")) {
			System.out.println("프로그램을 종료합니다.");
			return;
		}
		
		System.out.println("이름을 입력하세요!");
		name = sc.nextLine();
		
		System.out.println("점수를 입력하세요! ex) 99");
//		score = Integer.parseInt(sc.nextLine());
		
		score = sc.nextInt();
		sc.nextLine();
		
		if (name == null || name.length() == 0 || !(score>=0 && score<= 100)) {
			System.out.println("입력한 정보가 정확하지 않습니다.");
			System.out.println("프로그램을 종료합니다.");
			return;
		}
		
		if (score >= 80) {
			System.out.println("열심히 하셨네요!!");
		} else {
			System.out.println("분발하세요!!");
		}
		
		// 위의 조건식을 삼항연산자로 변경
//		System.out.println(score >= 80 ? "열심히 하셨네요!!" : "분발하세요!!");
		
		
		System.out.println("===================================================");
		
		// 'A':100~90	'B':89~80	'C':79~70	'D':69~60	'F':59~
		
		if (score>=90 && score<=100)
			grade = 'A';
		else if (score>=80 && score<90)
			grade = 'B';
		else if (score>=70 && score<80)
			grade = 'C';
		else if (score>= 60 && score<70)
			grade = 'D';
		else
			grade = 'F';
				
		System.out.printf("이름 : %s | 점수 : %d | 등급 : %c%n", name, score, grade);
		System.out.println("성적 처리 종료");
	}

}
