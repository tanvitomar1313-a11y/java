class Patient{
    int id;
    String name;
    int age;
    double temperature;
    Patient(int i,String n,int a,double t){
        id=i;name=n;age=a;temperature=t;
    }
    void checkFever(){
        System.out.println("Patient ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Temperature: "+temperature);
        if(temperature>100.4){
            System.out.println("Fever");
        }else{
            System.out.println("Normal");
        }
    }
}
public class Hospital{
    public static void main(String args[]){
        Patient p1=new Patient(1,"Riya",25,101.5);
        p1.checkFever();
    }
}
