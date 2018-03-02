package day004;

/**
 * Created by bomikim on 2018. 3. 2. 오전 10:10:08
 */

public class P163 {
	public static void main(String[] args) {
		System.out.println("**** 구구단 ****");
		
	OUT: for (int i=1; i<=9; i++) {		// for문 라벨링 작업 (이름 붙은 반복문)	
			for (int j=1; j<=9; j++) {
				
//				if (j == 5) break; // loop 빠져나가는 것
//				if (j == 5) continue; // loop 재진입
				if (j == 5) break OUT; // 바깥쪽 for문을 빠져나감
				
				System.out.printf("%2d*%d=%2d |", j, i, j*i);
			}
			
			System.out.println();
		}
	}
}
