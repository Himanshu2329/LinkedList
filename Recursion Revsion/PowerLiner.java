import java.util.Scanner;

public class PowerLiner {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int res=power(x,n);
        System.out.println(res);
    }
    public static int power(int x,int n) {
        if(n==0){
            return 1;
        }
        int resu=power(x,n-1);
        int next=x*resu;
        return next;
    }
}
