import java.util.Scanner;
public class UseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ShippedOrder shippedOrder = new ShippedOrder();

        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();
        shippedOrder.setCustomerName(customerName);

        System.out.print("Enter Customer Number: ");
        int customerNumber = scanner.nextInt();
        shippedOrder.setCustomerNumber(customerNumber);

        System.out.print("Enter Quantity Ordered: ");
        int quantityOrdered = scanner.nextInt();
        shippedOrder.setQuantityOrdered(quantityOrdered);

        System.out.print("Enter Unit Price: ");
        double unitPrice = scanner.nextDouble();
        shippedOrder.setUnitPrice(unitPrice);

        shippedOrder.computePrice();
        shippedOrder.displayFieldValues();
    }
}