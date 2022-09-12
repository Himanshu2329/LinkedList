public class SingleLevelInheriAC {
    public static void main(String[] args) {
        
    }
}
class shape{
    public void area() {
        System.out.println("display area");
    }
}
class eqi extends tri{
    public void area(int l,int h) {
        System.out.println(1/2*(l*h));
        
    }
}

class tri extends shape{
    public void area(int l,int h) {
        System.out.println(1/2*(l*h));
        
    }
}
