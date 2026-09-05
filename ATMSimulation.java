import java.util.Scanner;

class ATM{
    int correctPin=1234;
    double balance=10000;

    void checkPin(){
        Scanner sc=new Scanner(System.in);
        int attempts=0;
        boolean success=false;
        while(attempts<3){
            System.out.print("Enter PIN: ");
            int pin=sc.nextInt();
            if(pin==correctPin){
                success=true;
                break;
            }else{
                attempts++;
                System.out.println("Wrong PIN. Attempts left: "+(3-attempts));
            }
        }
        if(success){
            menu(sc);
        }else{
            System.out.println("Card blocked. Too many wrong attempts");
        }
    }

    void menu(Scanner sc){
        int choice;
        do{
            System.out.println("1.Withdraw 2.Deposit 3.Balance 4.Exit");
            choice=sc.nextInt();
            if(choice==1){
                System.out.print("Enter amount: ");
                double amt=sc.nextDouble();
                if(amt>balance) System.out.println("Insufficient balance");
                else{ balance-=amt; System.out.println("Withdrawal successful"); }
            }else if(choice==2){
                System.out.print("Enter amount: ");
                double amt=sc.nextDouble();
                balance+=amt;
                System.out.println("Deposit successful");
            }else if(choice==3){
                System.out.println("Balance: "+balance);
            }
        }while(choice!=4);
    }
}
public class ATMSimulation{
    public static void main(String args[]){
        ATM obj=new ATM();
        obj.checkPin();
    }
}
