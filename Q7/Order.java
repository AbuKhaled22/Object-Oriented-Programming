
import java.util.Scanner;

class Order {
    protected String customerName;
    protected int customerNumber;
    protected int quantityOrdered;
    protected double unitPrice;
    protected double totalPrice;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setQuantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void computePrice() {
        totalPrice = unitPrice * quantityOrdered;
    }

    public void displayFieldValues() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Number: " + customerNumber);
        System.out.println("Quantity Ordered: " + quantityOrdered);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Price: " + totalPrice);
    }
}

class ShippedOrder extends Order {
    
    public void computePrice() {
        super.computePrice();
        totalPrice += 12.00;
    }
}


