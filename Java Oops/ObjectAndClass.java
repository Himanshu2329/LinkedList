import java.util.*;

public class ObjectAndClass {
    public static class InnerObjectAndClass01 {
        int age;
        String name;

        void sayhi() {
            System.out.println(name + age + "says hi");
        }

    }

    public static void main(String[] args) {
        InnerObjectAndClass01 p1 = new InnerObjectAndClass01();
        p1.age = 10;
        p1.name = "a";
        p1.sayhi();
        InnerObjectAndClass01 p2 = new InnerObjectAndClass01();
        p2.age = 101;
        p2.name = "aa";
        p2.sayhi();
    }
}
