package assignment;

public class Prob2 {

	public static void main(String[] args) {
		System.out.println("<과제 1>");
		solution1();
		
		System.out.println();
		
		System.out.println("<과제 2>");
		solution2();
	}

	public static void solution1() {
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";

		// 프로그램을 구현부 시작.
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다.

		String[] source = sourceString.split(" ");
		String[] result = new String[source.length];
		
		for (int i=0; i<source.length; i++) {
			
			char[] temp = source[i].toCharArray();
			char[] temp2 = new char[temp.length];
			
			for (int j=0; j<temp.length; j++) {
				
				if (temp[j] == 'x' || temp[j] == 'y' || temp[j] == 'z') {
					temp2[j] = (char) ((temp[j] + 3) - 26);
				} else {
					temp2[j] = (char) (temp[j] + 3);
				}				
			}
			
			result[i] = String.copyValueOf(temp2);
//			System.out.println(result[i].toString());
		}
		
		for (int k=0; k<result.length; k++) {
			encodedString += result[k];
			encodedString += " ";
		}
		
		// 프로그램 구현부 끝.

		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);
	}
	
	public static void solution2() {
		
		int sum = 0;
		
		for (int i=1; i<=10; i++) {
			for (int j=1; j<=i; j++) {
//				System.out.println(j);
				sum = sum + j;
			}			
		}
		
		System.out.println(sum);
		
	}
}
