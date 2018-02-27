package day002;

import java.util.Scanner;

public class P40 {

	public static void main(String[] args) {
		//p41 scanner
		String name = null;
		int age = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요!");
		name = scanner.nextLine();
		
		System.out.println("나이를 입력하세요!");
//		age = Integer.parseInt(scanner.nextLine());
		age = scanner.nextInt(); // enter 값을 안 읽어 들임 -> 소진해주어야함
		scanner.nextLine(); // 남아있는 enter를 없애주는 작업!
		
		System.out.printf("입력한 이름은 %s %n입력한 나이는 %d %n", name, age);
	}

}
