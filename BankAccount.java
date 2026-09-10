import java.util.Scanner;

public class BankWithdrawalSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000;

        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            if (amount <= 0) {
                System.out.println("Error: Enter a valid amount greater than 0.");
            } else if (amount > balance) {
                System.out.println("Error: Insufficient balance.");
            } else {
                balance = balance - amount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            }

        } catch (Exception e) {
            System.out.println("Error: Please enter a number.");
        }

        sc.close();
    }
}
