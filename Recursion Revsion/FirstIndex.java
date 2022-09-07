import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int res=FirstIndex(arr,0,x);
        System.out.println(res);
    }

    private static int FirstIndex(int[] arr, int i, int x) {
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==x){
            return i;
        }else{

            int fia=FirstIndex(arr, i+1, x);
            return fia;
        }
    }

    
}
