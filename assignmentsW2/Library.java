package week2.assignmentsW2;

public class Library {
	
	public static String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
    public static void issueBook()
    {
    	System.out.println("Book issued successfully");
    	
    }
    public static void main(String[] args) {
    	Library l = new Library();
    	l.addBook("Book");
    	l.issueBook();
	}
}
