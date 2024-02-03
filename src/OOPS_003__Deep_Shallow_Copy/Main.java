package OOPS_003__Deep_Shallow_Copy;

public class Main {
    public static void main(String[] args) {
        /*
            This Program demonstrates the concept of Deep & Shallow copy in Java.
         */
        Book book1 = new Book("Atomic Habits", "James Clear");
        Book book2 = book1;     // Shallow Copy
        Book book3 = new Book(book1);   // Deep Copy
        // Assuming same data at memory block.
        if(book2 == book1) {
            // Address is same and Shallow copy
            System.out.println("Book2 is Shallow copy of Book1");
        } else {
            System.out.println("Book2 is Deep copy of Book1");
        }
        if(book3 == book1) {
            // Address is same and Shallow copy
            System.out.println("Book3 is Shallow copy of Book1");
        } else {
            System.out.println("Book3 is Deep copy of Book1");
        }
    }
}
