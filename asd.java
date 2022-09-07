import java.util.Scanner;

public class asd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int arr[][]=new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();
        int y=sc.nextInt();
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i==j){
                    sum+=arr[i][j];
                }
            }
        }
        int sum1=0;
        int res=arr[x][y];
        while (res > 0 || sum1 > 9)
        {
            if (res == 0) {
                res = sum1;
                sum1 = 0;
            }
            sum1 += res % 10;
            res /= 10;
        }
        System.out.println(sum/sum1);
        // System.out.println(sum);
        
    }
}
