import java.util.Scanner;

public class PowerLog {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int res=powerLog(x,n);
        System.out.println(res);
    }
    public static int powerLog(int x, int n) {
        if(n==0){
            return 1;
        }
        int xp2=powerLog(x, n/2);
        int xn=xp2*xp2;
        if(n%2==1){
            xn=xn*x;
        }
        return xn;
    }
}
