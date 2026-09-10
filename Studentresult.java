import java.util.Scanner;

public class StudentResultSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of subjects: ");
            int n = sc.nextInt();

            int total = 0;
            boolean valid = true;

            for (int i = 0; i < n; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                int marks = sc.nextInt();

                if (marks < 0 || marks > 100) {
                    System.out.println("Error: Marks must be between 0 and 100.");
                    valid = false;
                    break;
                }
                total = total + marks;
            }

            if (valid) {
                double average = total / n; // may cause division by zero if n = 0
                System.out.println("Average marks: " + average);
            }

        } catch (ArithmeticException e) {
            System.out.println("Error: No subjects entered, cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("Error: Please enter numbers only.");
        }

        sc.close();
    }
}
