import java.util.Scanner;

public class FindSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int m=sc.nextInt();
        int arr[][]=new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }     
        // n=3
        //     j  j  j
        /* i   1    2     3    (0,0) (0,1) (0,2)
         * i   4    5     6    (1,0)  (1,1)  (1,2)
         * i   7    8     9    (2,0)  (2,1)  (2,2)
        */

        int FirstDia=0;  // 1+5+9 = 15
        int SecDia=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i==j){
                    FirstDia+=arr[i][j];
                }
                if(i==n-j-1){
                    SecDia+=arr[i][j];
                }
            }
        }
        int res;
        if(SecDia>FirstDia){
            res=SecDia-FirstDia;
        }
        else{
            res=FirstDia-SecDia;
        }

        System.out.println(res);
        


    }
}



