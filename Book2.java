class Book{
	String title;
	String author;
	int pageNumber;
	int price;
	
	static int pricePerPage(int price1){
		return price1;
		
	}
	
	void details(){
		System.out.println("The Title of the book: " + title);
		System.out.println("The author of the book: " + author);
		System.out.println("The pagenumber of the book: " + pageNumber );
		System.out.println("the price of the book: " + price);
		System.out.println("\n");
	}
}
class Book2{
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
		
		System.out.println(" The price per page returned value: " + mybook1.pricePerPage(6));
		
		//mybook1.pricePerPage(5);
	
	}
}
