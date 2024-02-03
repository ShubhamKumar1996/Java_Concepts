package OOPS_002__Constructor;

public class Heater {
    private String brandName;
    public double avgTemperature;
    Heater() {
        super();
        System.out.println("Inside Default Constructor");
        brandName = "Havells";
        avgTemperature = 95.3;
    }
    Heater(String name, double temperature) {
        super();
        System.out.println("Inside Parameterized Constructor");
        brandName = name;
        avgTemperature = temperature;
    }
    Heater(Heater heater) {
        this.brandName = heater.brandName;
        this.avgTemperature = heater.avgTemperature;
    }
}
