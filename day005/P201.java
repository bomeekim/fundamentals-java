package day005;

public class P201 {
	public static void main(String[] args) {
		int[] num;
		num = new int[10];
		
		for (int i=0; i<num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
		}
		
		for (int data : num) {
			System.out.print(data + "  ");
		}
		
		// sort 오름차순 정렬
		for (int i=0; i<num.length-1; i++) {
			for (int j=i+1; j<num.length; j++) {
				if (num[i] > num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		
		System.out.println("\n============================================== ");
		
		for (int data : num) {
			System.out.print(data + "  ");
		}
	}
}
