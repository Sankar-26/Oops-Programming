package Q2;

import java.util.Scanner;

public class DriverMain {

    public static void main(String[] args) {

        //Scanner class to get input from user for the product class
        Scanner obj = new Scanner(System.in);
        Product[] productDetail = new Product[2];
        Employee[] employeeDetail = new Employee[2];


        //Using for loop to get the Product inputs and storing it in the array
        for (int i = 0; i < productDetail.length; i++) {

            System.out.println("Enter the Product Details:");
            System.out.print("Enter Pid:");
            int pid = obj.nextInt();
            System.out.print("Enter Price:");
            double price = obj.nextDouble();
            System.out.print("Enter Quantity:");
            int quantity = obj.nextInt();

            System.out.println();

            productDetail[i] = new Product(pid, price, quantity);
        }

        //Using for loop to get the Employee inputs and storing it in the array
        for (int i = 0; i < employeeDetail.length; i++) {

            System.out.println("Enter the Employee Details:");
            System.out.print("Enter EmpId:");
            int empid = obj.nextInt();
            System.out.print("Enter Name:");
            String name = obj.next();
            System.out.print("Enter Salary:");
            double salary = obj.nextDouble();

            System.out.println();

            employeeDetail[i] = new Employee(empid, name, salary);
        }

        //Printing the Product information with the sales tax detail
        System.out.println("The Product details after the sales tax are calculated ");
        for (Product product : productDetail) {
            System.out.println(product);
        }

        System.out.println();

        //Printing the Employee information with the income tax detail
        System.out.println("The Employee details after the income tax are calculated ");
        for (Employee emp : employeeDetail) {
            System.out.println(emp);
        }

    }
}

//Taxable Interface
interface Taxable {

    double salesTax = 0.07;
    double incomeTax = 0.105;

    //Abstract method
    double calcTax();
}