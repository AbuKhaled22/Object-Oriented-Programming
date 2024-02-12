public class Book {
    private String title;
    private String author;
    private int totalCopies;

    
    private static int totalBooks = 0;

    // Constructor
    public Book(String title, String author, int totalCopies) {
        this.title = title;
        this.author = author;
        this.totalCopies = totalCopies;

        
        addBook();
    }

    // Method to increment totalBooks
    private static void addBook() {
        totalBooks++;
    }

    // Method to display library information
    public void displayLibraryInfo() {
        System.out.println("Library Information:");
        System.out.println("Total number of books: " + totalBooks);
        System.out.println("Total number of copies available: " + totalCopies);
        System.out.println("-----------------------------");
    }
}

    






