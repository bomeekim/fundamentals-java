package day002;

public class P103 {

	public static void main(String[] args) {
		char c1 = 'a'; // 아스키 코드값 97
		char c2 = c1;
		
//		System.out.printf("c1 = %c%nc2 = %c%n", c1, c2);
//		System.out.println(c1+1);
		System.out.printf("c1 = %c %n", c1+1);
		System.out.println(c1++);
		System.out.println(++c1);
		
		//c1의 값을 대문자로 바꾸려면
		System.out.printf("%c => %c%n", c1, (char)(c1-32));
//		System.out.println(String.valueOf(c1).toUpperCase());
		
		c1 = 'a';
		
		// 알파벳 전부 출력
		for (int i=0; i<26; i++) {
			System.out.printf("%c => %c%n", c1, (char)(c1-32));
			c1++;
		}
	}

}
