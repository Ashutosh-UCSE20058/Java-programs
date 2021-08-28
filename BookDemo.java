class Book{
	String title;
	String author;
	int pageNumber;
	int price;
	
	void details(){
		System.out.println("The Title of the book: " + title);
		System.out.println("The author of the book: " + author);
		System.out.println("The pagenumber of the book: " + pageNumber );
		System.out.println("the price of the book: " + price);
		System.out.println("\n");
	}
}
class BookDemo{
	public static void main(String[] args){
		Book mybook1 = new Book();
		Book mybook2 = new Book();
		
		mybook1.title = "The Tales of Anubis";
		mybook1.author = "A R Sharma";
		mybook1.pageNumber = 19;
		mybook1.price = 100;
		
		
		mybook2.title = "The Hitopadesha";
		mybook2.author = "R K Sharma";
		mybook2.pageNumber = 46;
		mybook2.price = 200;
		
		mybook1.details();
		mybook2.details();
		
	
	}
}