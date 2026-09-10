import java.util.Scanner;

public class OnlineShoppingSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Enter discount percentage: ");
            double discount = sc.nextDouble();

            if (price <= 0) {
                System.out.println("Error: Price must be greater than 0.");
            } else if (quantity <= 0) {
                System.out.println("Error: Quantity must be greater than 0.");
            } else if (discount < 0 || discount > 100) {
                System.out.println("Error: Discount must be between 0 and 100.");
            } else {
                double bill = price * quantity;
                double finalAmount = bill - (bill * discount / 100);
                System.out.println("Final amount to pay: " + finalAmount);

                System.out.print("Enter payment amount: ");
                double payment = sc.nextDouble();

                if (payment < finalAmount) {
                    System.out.println("Error: Payment is less than the bill.");
                } else {
                    System.out.println("Payment successful. Change: " + (payment - finalAmount));
                }
            }

        } catch (Exception e) {
            System.out.println("Error: Please enter numbers only.");
        }

        sc.close();
    }
}
