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
class Book1{
	
	public static void main(String[] args){
		Book mybook1 = new Book();
		Book mybook2 = mybook1;
		
		mybook1.title = "The Tales of Anubis";
		mybook1.author = "A R Sharma";
		mybook1.pageNumber = 19;
		mybook1.price = 100;
		
		mybook1.details();
		
		
		mybook2.details();
		
	
	}
}