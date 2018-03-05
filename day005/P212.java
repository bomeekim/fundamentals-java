package day005;

public class P212 {
	public static void main(String[] args) {
		String[][] i = {
				{"홍길동", "90", "80", "99"},
				{"고길동", "91", "69", "79"}
		};
		
		 
		System.out.println("이름     국어    수학    영어    총점 ");
		
		for (int j=0; j<i.length; j++) {
			
			int sum = 0;
			
			for (int k=0; k<i[j].length; k++) {
				
				if (k != 0) {
					sum += Integer.parseInt(i[j][k]);
				}
				
				System.out.print(i[j][k] + "    ");
			}
			System.out.println(sum);
		}
	}
}
