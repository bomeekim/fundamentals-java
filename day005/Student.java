package day005;

// java beans
public class Student {
	// 변수 => 데이터가 됨!
	String name;
	int kor;
	int math;
	int eng;
	
	// void : 수행하고나서 되돌려주는 값이 없음
	public void display() {
		System.out.printf("이름 : %s 국어 : %d 수학 : %d 영어 : %d\n", name, kor, math, eng);
		
		return;
	}
}
