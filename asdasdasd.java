import java.util.Scanner;

public class asdasdasd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][i]=sc.nextInt();
            }
        }
        int x=sc.nextInt();
        int sum=0;
        int y= -1;
        int z= -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(x==arr[i][j]){
                    sum=i+j;
                    y=i+sum;
                    z=j;
                }
            }
            
        }
        int new1=arr[y][z];  
        int s=0;
        while (new1>0) {
            int dig=new1%10;
            s+=dig;
            new1/=10;
        }
        System.out.println(s);

        
    }
}
