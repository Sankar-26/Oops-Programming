package Q2;

public class Employee implements Taxable {

    // Employee attributes
    public int employeeId;
    public String name;
    private double salary;

    //Constructor
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }


    //toString method to display the records
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", IncomeTax=" + calcTax() +
                '}';
    }

    //CalcTax method implemented from the Taxable interface to calculate the income tax on yearly salary.
    @Override
    public double calcTax() {
        return Math.round(incomeTax * this.salary * 12);
    }

}
