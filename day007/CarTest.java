package day007;

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car("black", "auto", 4);
		c1.print();
		
		Car c2 = new Car();
		c2.print();
		
		String msg = new String("~");
		System.out.println(msg);
		
		System.out.println("=======================================");
		
		Car t1 = new Car();
		Car t2 = new Car("white", "auto", 4);
		Car t3 = new Car("Gray", "auto", 4);
		Car t4 = new Car("Red", "auto", 4);
		
		t1.print();
		t2.print();
		t3.print();
		t4.print();
	}
}
