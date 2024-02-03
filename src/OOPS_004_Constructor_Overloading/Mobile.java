package OOPS_004_Constructor_Overloading;

public class Mobile {
    private String brandName;
    private double price;
    // Default constructor
    Mobile() {
        this.brandName = "";
        this.price = 0;
    }
    // Overloading constructor with parameterized constructor.
    Mobile(String brandName, double price) {
        // Differ by num of args
        this.brandName = brandName;
        this.price = price;
    }
    Mobile(String brandName) {
        // Differ by num of args
        this(brandName, 0);
    }
    Mobile(double price, String brandName) {
        // Differ by sequence of args
        this(brandName, price);
    }
}
