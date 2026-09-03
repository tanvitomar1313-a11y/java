import java.util.Scanner;

class StudentResult{
    public static void main(String[] args){
        System.out.print("Enter student name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int total = 0;
        int[] marks = new int[5];
        System.out.println("Enter marks for 5 subjects:");

        for(int i=0; i<5; i++){
            marks[i] = sc.nextInt();
            total+=marks[i];
        }
        double percentage = total / 5.0;

        String grade;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 50)
            grade = "D";
        else
            grade = "F";

        System.out.println("Student Name: " + name); 
        System.out.println("Total Marks: " + total); 
        System.out.println("Percentage: " + percentage + "%"); 
        System.out.println("Grade: " + grade);
    }
}
