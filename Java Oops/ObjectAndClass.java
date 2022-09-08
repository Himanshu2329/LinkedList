import java.util.*;

/**
 * ObjectAndClass
 */
public class ObjectAndClass {

    public void eat(){
        System.out.println("kha rha h");
    }
    public void run(){
        System.out.println("bhag rha h");
    }
    public static void main(String[] args) {
        System.out.println("1");
        ObjectAndClass buzzo=new ObjectAndClass();
        buzzo.eat();
        buzzo.run();
        Birds aa=new Birds();
        aa.Fly();
        animal bruno=new animal();
        bruno.color="blue";
        bruno.age=25;
        // bruno.hello();
        System.out.println(bruno.color+" "+bruno.age);
    }
}
class Birds{
    public void Fly() {
        System.out.println("udd rha h");
    }
}
class animal{
    String color;
    int age;
    
    // void hello(){
    //     System.out.println(color+age);
    // }
}
