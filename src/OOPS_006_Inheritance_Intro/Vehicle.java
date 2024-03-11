package OOPS_006_Inheritance_Intro;

public class Vehicle {
    private String brandName;
    private String vehicleType;
    private double price;
    Vehicle() {
        brandName = "";
        vehicleType = "";
        price = 0;
    }
    Vehicle(String brandName, String vehicleType, double price) {
        this.brandName = brandName;
        this.vehicleType = vehicleType;
        this.price = price;
    }
    public String toString() {
        return String.format("Brand name: %s, Vehicle type: %s, Price: %.3f", brandName, vehicleType, price);
    }
}
