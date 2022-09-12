// import javax.swing.plaf.synth.SynthSpinnerUI;

public class PolyMorAC {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Himanshu";
        s1.age=58;
        s1.printInfo(s1.name + s1.age); // isme dono funtion ko call krege

        s1.printInfo(s1.age,s1.name); // kyuki funtion me hmne phele age pass kri hui h
    }
}
class Student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(int age,String name){
        System.out.println(name + " " +age);
    }
}
