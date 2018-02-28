package day003;

public class P158 {

	public static void main(String[] args) {
		
		//msg trim() 실습
		String msg = "               Hello java Programming Test     ";
		System.out.printf("[%s] %d %n", msg, msg.length());
		
		msg = msg.trim();
		System.out.printf("[%s] %d %n", msg, msg.length());
	}

}
