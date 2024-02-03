package OOPS_002__Constructor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Entry in main() function");
        Heater heater1 = new Heater("Crompton", 38.5);
        Heater heater2 = new Heater(heater1);
        System.out.println("Exit from main() function");
    }
}
