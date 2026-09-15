class FoodPreparation extends Thread {
    public void run() {
        System.out.println("Food preparation started...");
        try {
            Thread.sleep(2000); // simulate time taken to prepare food
        } catch (InterruptedException e) {}
        System.out.println("Food preparation completed.");
    }
}

class FoodDelivery extends Thread {
    public void run() {
        System.out.println("Food delivery started...");
        System.out.println("Food delivered to customer.");
    }
}

public class FoodDeliveryDemo {
    public static void main(String[] args) throws InterruptedException {
        FoodPreparation prep = new FoodPreparation();
        FoodDelivery delivery = new FoodDelivery();

        prep.start();
        prep.join();      // main thread waits until prep finishes
        delivery.start(); // delivery starts only after prep completes
    }
}
