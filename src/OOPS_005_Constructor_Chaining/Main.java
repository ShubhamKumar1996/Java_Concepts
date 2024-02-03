package OOPS_005_Constructor_Chaining;

public class Main {
    public static void main(String[] args) {
        /*
            Program to demonstrate 2 ways of constructor chaining:
                1. Within same class: using this() keyword.
                2. From base class: using super() keyword to call parent class constructor.
         */
        Jeans levisJeans = new Jeans("Levis", 3000);
        Jeans pepeJeans = new Jeans("Pepe");
        Jeans casualJeans = Jeans.createJeans();
        System.out.println(levisJeans.to_string());
        System.out.println(pepeJeans.to_string());
        System.out.println(casualJeans.to_string());
    }
}
