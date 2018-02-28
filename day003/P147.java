package day003;

public class P147 {
	public static void main(String[] args) {
		System.out.println("성적처리");

		String name = null;
		int score = 0;
		char grade = ' '; // 'A' 'B' 'C'

		name = "홍길동";
		score = 59;

		if (name == null || name.length() == 0 || !(score >= 0 && score <= 100)) {
			System.out.println("입력한 정보가 정확하지 않습니다.");
			System.out.println("프로그램을 종료합니다.");
			return;
		}

		// 등급처리
		switch (score / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}

		System.out.printf("이름 : %s | 점수 : %d | 등급 : %c%n", name, score, grade);
		
		switch (grade) {
		case 'F':
			System.out.println("학사경고입니다.");
			break;
		}
		
		//jdk1.7 version (String 타입 가능)
		String msg = "";
		switch (msg){
		case "":
			System.out.println("메세지가 비었습니다. 등록해주세요");
			break;
		}
		
		System.out.println("성적 처리 종료");
	}
}
