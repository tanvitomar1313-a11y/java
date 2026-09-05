class Employee{
    String name;
    double salary;
    Employee(String n,double s){
        name=n;
        salary=s;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}
class Manager extends Employee{
    double bonus;
    Manager(String n,double s,double b){
        super(n,s);
        bonus=b;
    }
    void display(){
        super.display();
        System.out.println("Bonus: "+bonus);
        System.out.println("Total Salary: "+(salary+bonus));
    }
}
public class EmployeeInheritance{
    public static void main(String args[]){
        Manager m1=new Manager("Aman",30000,5000);
        m1.display();
    }
}
