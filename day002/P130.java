package day002;

public class P130 {

	public static void main(String[] args) {
		char c = 'f';
		
		boolean b = '0' <= c && c <= '9';
		System.out.println(c + " 숫자인지? " + b);
		
		boolean b2 = 97 <= c && c <= 122;
		System.out.println(c + " 소문자인지? " + b2);
		
//		if (97 <= c && c <= 122) { // 아스키 코드 값을 직접 쓰는 방법
//			System.out.printf("%c 는 소문자입니다. %n", c);
//		}
//		
//		if ('0' <= c && c <=  '9') { // 문자를 가지고 비교 연산도 가능! ('0' = 48, '9' = 57)
//			System.out.printf("%c는 숫자입니다. %n", c);
//		}				
	}
	
}
