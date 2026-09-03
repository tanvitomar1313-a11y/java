class employeeSalary{
    String eid;
    String name;
    double salary;
    double hra;
    double da;
    employeeSalary(double s,String n,String id){
        salary=s;
        name=n;
        eid=id;
        hra=0.0;
        da=0.0;
    }
    void display(){
        hra=0.2*salary;
        da=0.1* salary;
        System.out.println(hra+da+salary);
    }
}
public class salary {
    public static void main(String arg[]){
        employeeSalary obj=new employeeSalary(20000, "Aman", "E10088");
        obj.display();
    }
}
