package OOPS_003__Deep_Shallow_Copy;

public class Book {
    private String name;
    private String author;

    // Parameterized Constructor.
    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    Book(Book givenBook) {
        // Method 1
        // this(givenBook.name, givenBook.author);
        // Method 2
        this.name = givenBook.name;
        this.author = givenBook.author;
    }
}
