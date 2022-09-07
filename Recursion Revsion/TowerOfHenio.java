import java.util.Scanner;

public class TowerOfHenio {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t1=sc.nextInt();
        int t2=sc.nextInt();
        int t3=sc.nextInt();
        tower(n,t1,t2,t3);

    }   
    public static void tower(int n,int t1,int t2,int t3) {
        if(n==0){
            return;
        }
        tower(n-1,t1,t3,t2);
        System.out.println(n+ "["+t1 +"->"+t2+"]");
        tower(n-1,t3,t2,t1);
        // System.out.println(n+ "["+t3 +"->"+t3+"]");
        
    }
}
