import java.util.ArrayList;

public class ArrayListintro {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        // System.out.println(himanshu);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        
        // for(int val:list){
        //     System.out.println(val);
        // }
        // for (int i = 0; i < list.size(); i++) {
        //     int val=list.get(i);            
        //     System.out.println(val);
        // }
        list.set(2,300);
        list.add(2,3000);
        System.out.println(list+ " "+list.size());
    }
}
