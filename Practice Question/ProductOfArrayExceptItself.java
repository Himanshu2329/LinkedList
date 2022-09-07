import java.util.Scanner;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        // int ress=Itself(arr,n);
        int rest[]=Itself(arr, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(rest[i]);
        }
        // System.out.println(ress);
    }
    private static int[] Itself(int arr[],int n) {
        //1. make the right array
        int[] resarr=new int[arr.length];
        int prod=1;
        for (int i = arr.length;i>=0 ;i--) {
            prod=prod*arr[i];
            resarr[i]=prod;
        }
        // 2. make the result with maintaining of left prod
        prod=1;
        int rest[]=new int[arr.length];
        for (int i = 0; i < arr.length-1; i++) {
            int lp=prod;
            int rt=resarr[i+1];

            rest[i]=lp*rt;
            prod*=arr[i];
        }
        rest[arr.length-1]=prod;
        return rest;
    }
}
