package day007;

public class P265 {
	public static void main(String[] args) {
		int x = 99;
		DataParam.change(x);
		System.out.println(x);
		System.out.println("===========================");
		Data d = new Data();
		d.x = 99;
		DataParam.change(d);
		System.out.println(d.x);
	}
}

class Data {
	int x;
	
}

class DataParam {
	static void change(int x) {
		x = 100;
	}
	
	static void change(Data data) {
		data.x = 100;
	}
}
