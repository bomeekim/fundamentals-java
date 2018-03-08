package assignment;

public class Prob7 {
	
	public static void main(String[] args) {
		Book book1 = new Book("Java Program", 27000);
		Book book2 = new Book("JSP Program", 13000);
		Book book3 = new Book("SQL Fundamentals", 20000);
		Book book4 = new Book("JDBC Program", 15000);
		Book book5 = new Book("EJB Program", 18000);

		BookMgr manager = new BookMgr(5);
		manager.addBook(book1);
		manager.addBook(book2);
		manager.addBook(book3);
		manager.addBook(book4);
		manager.addBook(book5);
		
		System.out.println("=== 책 목록 ===");
		manager.printBookList();
		
		System.out.println();
		System.out.println("=== 책 가격의 총합 ===");
		manager.printTotalPrice();
	}
}

class Book {
	private String title;
	private int price;
	
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

class BookMgr {
	Book[] booklist;
	int count = 0;
	
	
	public BookMgr(int size) {
		super();
		this.booklist = new Book[size];
	}

	public void addBook(Book book) {
		this.booklist[count] = book;
		this.count++;
	}
	
	public void printBookList() {
		for (int i=0; i<booklist.length; i++) {
			
			try {
				System.out.printf("#%d %s %d원%n", i+1, booklist[i].getTitle(), booklist[i].getPrice());	
			} catch (NullPointerException e) {
				return;
			}
		}
	}
	
	public void printTotalPrice() {
		int sum = 0;
		
		for (int i=0; i<booklist.length; i++) {
			try {
				sum += booklist[i].getPrice();
			} catch (NullPointerException e) {
				break;
			}
			
		}
		
		System.out.println("전체 책 가격의 합 : " + sum + "원");
	}
}
