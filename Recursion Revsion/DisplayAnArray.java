import java.util.Scanner;

// import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class DisplayAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        DisplayAnArray(arr,0);
    }
    public static void DisplayAnArray(int arr[],int idx) {
        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);
        DisplayAnArray(arr, idx+1);
    }
}
