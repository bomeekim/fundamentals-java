package day002;

public class P54 {

	public static void main(String[] args) {
		int num = 37;
		System.out.printf("%d => %x%n", num, num); // 16진수
		System.out.printf("%d => %o%n", num, num); // 8진수
		System.out.printf("%d => %s%n", num, Integer.toBinaryString(num)); // 2진수
	}
}
