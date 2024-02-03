package OOPS_001__Access_Specifier;

public class Main{
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        employee1.set("Shubham", 3000.501);
        employee1.employeeName = "Shubham2";
        Employee employee3 = employee2;
        employee2 = employee1;
        employee1 = employee3;
        employee2.get();
        employee1.get();
    }
}