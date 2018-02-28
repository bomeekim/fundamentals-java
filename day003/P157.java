package day003;

public class P157 {

	public static void main(String[] args) {
		
		//1~10 합 구하기
		int sum = 0;
		
		for (int i=0; i<10; i++) {
			sum += i;
			System.out.printf("%3d +", i);
		}
		
		System.out.println();
		System.out.println("합계 : " + sum);
	}

}
