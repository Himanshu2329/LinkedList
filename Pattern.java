import java.util.Arrays;
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int arr[]=new int[n];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i]=sc.nextInt();
        // }
        // Arrays.sort(arr);
        // int max=arr[arr.length-1]-arr[arr.length-2];

        // int diff = Integer.MAX_VALUE;
 
        // // Find the min diff by comparing adjacent
        // // pairs in sorted array
        // for (int i = 0; i < n - 1; i++){

        //     if (arr[i + 1] - arr[i] < diff){
                
        //         diff = arr[i + 1] - arr[i];
        //     }
        // }
        // System.out.println(diff +" "+ max);

        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int A[][]=new int[m][n];
        int B[][]=new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j]=sc.nextInt();
            }
        }

        int [][]C=new int[m][n];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < n.length; j++) {
                C[i][j]=A[i][j]+B[i][j];
            }
        } 

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }


    }
}
