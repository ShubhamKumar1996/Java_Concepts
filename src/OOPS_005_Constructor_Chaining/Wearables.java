package OOPS_005_Constructor_Chaining;

public class Wearables {
    private String productType;
    private String brandName;
    private double price;

    {
        // Init block: Executed before any other constructor
        System.out.println("Inside init block");
        this.productType = "";
        this.brandName = "";
        this.price = 0;
    }
    Wearables(String productType, String brandName, double price) {
        this.productType = productType;
        this.brandName = brandName;
        this.price = price;
    }

    public String to_string() {
        return String.format("Product type: %s, BrandName: %s, Price: %s", productType, brandName, price);
    }
}
