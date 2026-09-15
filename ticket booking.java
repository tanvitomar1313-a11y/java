class Theatre {
    private int availableSeats = 5;

    synchronized void bookSeat(String customer, int seatsRequested) {
        System.out.println(customer + " requesting " + seatsRequested + " seat(s)");
        if (availableSeats >= seatsRequested) {
            availableSeats -= seatsRequested;
            System.out.println(customer + " booked " + seatsRequested + " seat(s). Seats left: " + availableSeats);
        } else {
            System.out.println(customer + " could not book. Only " + availableSeats + " seat(s) left.");
        }
    }
}

public class TicketBookingDemo {
    public static void main(String[] args) {
        Theatre theatre = new Theatre();

        Thread c1 = new Thread(() -> theatre.bookSeat("Customer1", 2));
        Thread c2 = new Thread(() -> theatre.bookSeat("Customer2", 2));
        Thread c3 = new Thread(() -> theatre.bookSeat("Customer3", 2));

        c1.start();
        c2.start();
        c3.start();
    }
}
