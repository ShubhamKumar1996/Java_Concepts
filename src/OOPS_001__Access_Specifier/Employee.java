package OOPS_001__Access_Specifier;

public class Employee {
    public String employeeName;
    protected double employeeSalary;

    public void set(String name, double salary) {
        this.employeeName = name;
        this.employeeSalary = salary;
    }

    public void get() {
        System.out.printf("Employee name is: %s\n Salary is: %.2f\n", this.employeeName, this.employeeSalary);
    }
}
