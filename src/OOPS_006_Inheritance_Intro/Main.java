package OOPS_006_Inheritance_Intro;

public class Main {
    /*
        Code to demonstrate mechanism of inheritance in java.
     */
    public static void main(String[] args) {
        Vehicle nexonCar = new Car("Tata Nexon", "SUV", 10_00_000);
        Vehicle splenderBike = new Bike("Splender", "Commuter", 1_00_000);
        System.out.println(nexonCar.toString());
        System.out.println(splenderBike.toString());
    }
}
