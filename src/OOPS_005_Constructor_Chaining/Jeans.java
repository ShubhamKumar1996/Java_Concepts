package OOPS_005_Constructor_Chaining;

public class Jeans extends Wearables{
    Jeans(String brandName, double price) {
        // Example of outside class constructor chaining.
        super("Jeans", brandName, price);
    }
//    Jeans() {
//        // Example of Within class chaining
//        this("", 0);
//    }
    Jeans(String brandName) {
        this(brandName, 0);
    }
    Jeans(double price) {
        this("", price);
    }
    private Jeans() {
        this("", 0);
        System.out.println("Private constructor");
    }
    public static Jeans createJeans() {
        return new Jeans();
    }
}
