package OOPS_004_Constructor_Overloading;

public class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();   // Don't want to initialize object.
        Mobile appleMobile = new Mobile("Apple");    // Initialize only with brand name.
        Mobile samsungMobile = new Mobile("Samsung", 20_000);   // Initialize with brand name & price.
        Mobile vivoMobile = new Mobile(10_000, "Vivo");
    }
}
