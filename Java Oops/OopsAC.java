// import java.sql.Struct;

public class OopsAC {
    public static void main(String[] args) {
    //     pen p1=new pen();
    //     pen p2=new pen();
    //     p1.color="red ";
    //     p1.type="ball";
    //     System.out.println("your pen is "+ p1.color+p1.type +" pen");
    //    p2.color="black ";
    //    p2.type="gel";

    //    p1.color();
    //    p2.color();

    // Student s1=new Student("Himanshu",20);

    Student s1=new Student();
    s1.Age=19;
    s1.Name="Himanshu ";
    // s1.printInfo();

    // Student s2=new Student("Rookie",50);

    Student s2=new Student(s1);
    // s2.Age=18;
    // s2.Name="Rookie ";
    s2.printInfo();
    }   
}
// class pen{
//     String color;
//     String type;

//     public void write(){
//         System.out.println("Writing something");
//     }
//     public void color(){
//         System.out.println(this.color+ this.type);
//     }
// }

class Student{
    String Name;
    int Age;

    public void printInfo(){
        System.out.println(this.Name+ this.Age);
        
    }
    // Student( String Name, int Age){
    //     System.out.println("Constructor Called");
    //     this.Name=Name;
    //     this.Age=Age;
    
    
    // }
    
    // Copy Constructor
    Student(Student s2){
            System.out.println("Constructor Called");
            this.Name=s2.Name;
            this.Age=s2.Age;
        
    }

    Student(){

    }
}