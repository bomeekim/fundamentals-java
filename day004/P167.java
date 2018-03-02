package day004;
/**
 * Created by bomikim on 2018. 3. 2. 오전 10:40:00
 */
public class P167 {
	public static void main(String[] args) {
		String msg = "java test";
		
		for (int i=5; i>0; i--) {
			System.out.println(msg);
		}
		
		System.out.println("===============================");
		
		int i=0;
		
		while (i<5) {
			System.out.println(msg);
			i++;
		}
		
		System.out.println("===============================");
	}
}
