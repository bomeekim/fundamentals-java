package day007;

/**
 * @author bomikim
 * @since 2018. 3. 7.
 * @version 1.0
 */

public class Car {
	public String color;
	public String gearType;
	public int door;
	
	public Car() {
		System.out.println("Car() 호출");
	}
	
	 	
	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}



	/**
	 * Car 정보 출력 메소드
	 */
	
	public void print() {
		System.out.println(color +", " + gearType + ", " + door);
	}
}
