package day004;
/**
 * Created by bomikim on 2018. 3. 2. 오후 2:01:02
 */
public class P189 {
	public static void main(String[] args) {
		int[] score = null;
		score = new int[5];
		
		score[0] = 88;
		score[1] = 98;
		score[2] = 89;
		score[3] = 78;
		score[4] = 100;
		
		String[] name = {"홍길동", "김길동", "고길동", "박길동", "강길동"};
		
		char[] grade = new char[score.length];
		for (int i=0; i<score.length; i++) {
			grade[i] = score[i] >= 90 ? 'A' : (score[i] >= 80 ? 'B' : (score[i] >= 70 ? 'C' : (score[i] >= 60 ? 'D' : 'F')));
			System.out.println(name[i].charAt(0) + "** : " + score[i] + " => " + grade[i]);
		}
		
	}
}
