package assignment;

/**
 * Created by bomikim on 2018. 3. 7. 오후 4:08:25
 */
public class Prob6 {

	/**
	 * 
	 * 문제1. 아래의 조건을 참조하여 Book 클래스를 구현하시오.
	 * 
	 * Book 클래스의 제약조건 
	 * 
	 * 1. 책 제목(title)과 가격(price)정보를 저장하는 멤버변수가 있어야 한다.
	 * 2. 생성자 함수 만들기 public Book() public Book(String title,int price) 
	 * 3. 책 제목(title)과 가격(price)정보를 출력하는 함수를 만들기
	 * 
	 * p270 재귀호출
	 * 
	 */

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.print();
		
		Book book2 = new Book("어린 왕자", 13900);
		book2.print();
	}
	
	static class Book {
		String title;
		int price;
		
		public Book() {
			System.out.println("Book() 호출");
		}
		
		public Book(String title, int price) {
			this.title = title;
			this.price = price;
		}
		
		public void print() {
			System.out.printf("[Book] title : %s , price : %d%n", title, price);
		}
	}

}
