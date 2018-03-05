package day005;

import java.util.Arrays;

public class P210 {
	public static void main(String[] args) {
		String msg = "Hello java test...";
		
		char[] c = new char[msg.length()];
		
		for (int i=0; i<c.length; i++) {
			c[i] = msg.charAt(i);
		}
		
		System.out.println(Arrays.toString(c));
		
		char[] cc = msg.toCharArray();
		System.out.println(Arrays.toString(cc));
		
		System.out.println("====================================");
		String data = "홍길동/90/80/97";
		String[] d = data.split("/");
		System.out.println(Arrays.toString(d));
	}
}
