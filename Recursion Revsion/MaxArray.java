import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int res=maxarr(arr,0);
        System.out.println(res);
    }
    public static int maxarr(int arr[],int idx) {
        if(idx==arr.length-1){
            return arr[idx];
        }
        int pro=maxarr(arr, idx+1);
        if(pro>arr[idx]){
            return pro;
        }
        else{
            return arr[idx];
        }
        // return 0;
        
    }
}
