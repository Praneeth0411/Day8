public class Demo {
	public static void main(String[] args) {
		
		Book book = new Book("Ahk778","Kawa Complete ref",
				"Kiran",2500); 
		
				
		System.out.println(book);
		book.setTitle("Java Complete Reference");
		System.out.println(book);
		
		Book cBook = new Book("C6543","C lang",
				"Kalyan",3500); 
		
		System.out.println(cBook);
		  
	}
}