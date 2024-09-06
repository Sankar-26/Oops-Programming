package Q2;

public class Product implements Taxable {

    //Product attributes
    public int pid;
    public double price;
    public int quantity;


    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    //toString method to display the records
    @Override
    public String toString() {
        return "Product{" +
                "Pid=" + pid +
                ", Price=" + price +
                ", Quantity=" + quantity +
                ", SalesTax=" + calcTax() +
                '}';
    }

    //CalcTax method implemented from the Taxable interface to calculate the sales tax on te price of the product.
    @Override
    public double calcTax() {
        return Math.round(salesTax * this.price * this.quantity);
    }


}
