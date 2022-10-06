/**
 * HiearchicalInheritenceAC
 */
public class HiearchicalInheritenceAC {

    public static void main(String[] args) {
       tri t=new tri();
    //    t.l=10;
    //    t.h=20;
       t.area(15,26);
        


    }
}
class shape{
    int r;
    public void area() {
        System.out.println("Print area");
    }
}
class tri extends shape{
    int l;
    int h;
    public void area(int l,int h) {
        System.out.println(1/2*(l*h));
    }
}

class circle extends shape{
    public void area(int r) {
        System.out.println(3.14*r*r);
    }
}
