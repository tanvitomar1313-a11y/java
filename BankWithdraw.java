class BankWithsrawDemo {
    private int balance = 10000;

    // synchronized ensures only one thread can execute this at a time
    synchronized void withdraw(String customer, int amount) {
        System.out.println(customer + " trying to withdraw " + amount);
        if (balance >= amount) {
            balance -= amount;
            System.out.println(customer + " withdrew " + amount + ". Remaining balance: " + balance);
        } else {
            System.out.println(customer + " failed to withdraw " + amount + ". Insufficient balance.");
        }
    }
}

public class BankWithdrawDemo {
    public static void main(String[] args) {
        BankWithsrawDemo account = new BankWithsrawDemo();

        Thread t1 = new Thread(() -> account.withdraw("Customer1", 7000));
        Thread t2 = new Thread(() -> account.withdraw("Customer2", 6000));

        t1.start();
        t2.start();
    }
}
