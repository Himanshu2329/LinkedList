import java.util.Scanner;

public class PrintZigZag {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pzz(n);
    }
    public static void pzz(int n) {
        if(n==0){
            return;
        }
        System.out.println("pre "+n);
        pzz(n-1);
        System.out.println("in "+n);
        pzz(n-1);
        System.out.println("post "+n);
    }
}
