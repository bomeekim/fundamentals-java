package day007;

public class CardTest {

	public static void main(String[] args) {
		Card[] cards = {};
		
		Card card1 = new Card();
		card1.kind = "Spade";
		card1.number = 7;

		Card card2 = new Card();
		card2.kind = "Heart";
		card2.number = 9;
		
		card1.print();
		card2.print();
	}

}
