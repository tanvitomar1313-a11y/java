import java.util.Scanner;

public class BusBookingSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int availableSeats = 40;

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Enter number of seats: ");
            int seats = sc.nextInt();

            if (age <= 0) {
                System.out.println("Error: Age must be greater than 0.");
            } else if (seats <= 0) {
                System.out.println("Error: Seats must be greater than 0.");
            } else if (seats > availableSeats) {
                System.out.println("Error: Not enough seats available.");
            } else {
                System.out.println("Booking successful for " + seats + " seat(s).");
            }

        } catch (Exception e) {
            System.out.println("Error: Please enter numbers only.");
        }

        sc.close();
    }
}
