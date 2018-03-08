package day007;

public class Card {
	int number;
	String kind;
	
	int width;
	int height;
	
	public void print() {
		System.out.printf("Card[%s, %d, (%d, %d)] %n", kind, number, width, height);
	}
}
