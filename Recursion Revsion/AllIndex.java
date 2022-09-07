import java.util.*;
import java.io.*;

public class AllIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // int x = Integer.parseInt(br.readLine());
        int x=sc.nextInt();
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int i, int fsf) {
        if(i==arr.length){
            return new int[fsf];
        }

        if(arr[i]==x){
            int[] iarr=allIndices(arr, x, i+1, fsf+1);
            iarr[fsf]=i;
            return iarr;
        }
        else{
            int[] iarr= allIndices(arr, x, i+1, fsf);
            return iarr;
        }
        // return null;
    }   
}
