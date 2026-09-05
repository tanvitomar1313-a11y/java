class Student{
    String name;
    String courses[]=new String[5];
    int count=0;
    Student(String n){
        name=n;
    }
    void registerCourse(String c){
        if(count>=5){
            System.out.println("Cannot register. Maximum 5 courses allowed");
        }else{
            courses[count]=c;
            count++;
            System.out.println(c+" registered successfully");
        }
    }
    void displayCourses(){
        System.out.println("Courses registered by "+name+":");
        for(int i=0;i<count;i++){
            System.out.println((i+1)+". "+courses[i]);
        }
    }
}
public class CourseRegistration{
    public static void main(String args[]){
        Student s1=new Student("Riya");
        s1.registerCourse("Java");
        s1.registerCourse("DBMS");
        s1.registerCourse("OS");
        s1.registerCourse("DSA");
        s1.registerCourse("Networking");
        s1.registerCourse("AI");   // 6th course, should be rejected
        s1.displayCourses();
    }
}
