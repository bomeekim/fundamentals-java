package day002;

public class P131 {

	public static void main(String[] args) {
		int score = -87;
		
		boolean valid = 0 <= score && score <= 100;
		char c = valid ? 'O' : 'X'; //삼항연산자
		System.out.println(score + " 유효성 여부 : " + c);
		
		System.out.println(score >= 80 ? "합격" : "불합격"); // 바로 출력할 수 있음
		
		/*
		if (!valid) {
			System.out.println("데이터 입력 오류");
			return;
		}
		
		System.out.println(score +" 우수? " + (score >= 90));
		System.out.println(score + " 재시여부? " + (score < 70));
		*/
	}

}
