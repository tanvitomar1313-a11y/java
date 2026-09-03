class BankDetails{
    int acc;
    String name;
    double balance;
    BankDetails(double m,String n){
        balance=m;
        name=n;
    }
    void deposit(int money){
        balance=balance+money;
    }
    void withdraw(int m){
        if(m<=balance){
            balance=balance-m;
        }
    }
    void display(){
        System.out.println(balance);
    }
}
public class account{
    public static void main(String arg[]){
        BankDetails obj=new BankDetails(100, "Aastha");
        obj.deposit(1000);
        obj.display();
        obj.withdraw(500);
        obj.display();
    }
}
