package day002;

public class Test01 {

	public static void main(String[] args) {
		char c = 'A'; //A=> 65, a=>97
		boolean flag = true;
		
		System.out.println(c + " " + flag);
		flag = (c == 'B');
		
		System.out.println(flag);
		System.out.println(c);
		System.out.println((int) c);
		
		int cc = c;
		System.out.println(cc);
		
		String name1 = "김보미";
		String name2 = new String("홍길동");
		
		System.out.println(name2.charAt(0));
		
		String name3 = null;
		System.out.println(name3);
		
		name3 = name1;
		System.out.println(name3);
		
		name1 = null;
		name3 = null;
	}
}
