import java.util.Arrays;
import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int flag=-1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==k){
                flag=i;
            }
        }
        Arrays.sort(arr);
        int flag2=-1;
        if(arr[arr.length-1]==k){
            flag2=10;
        }
        if(flag2==10){
            System.out.println(arr[arr.length-2]);
        }
        if(k==arr[0]){
            System.out.println(arr[1]);
        }
        if(k!=arr[arr.length-1]){
            
            int ele=arr[flag-1];
            int ele2=arr[flag+1];
        
            int diff=k-ele;
            int diff2=ele2-k;

            if(diff<diff2){
                System.out.println(ele);
            }
            else if(diff2<diff){
                System.out.println(ele2);
            }
            else{
                System.out.println(ele2);
            }
        }


    }
}
