import java.util.Arrays;
import java.util.Scanner;

public class missingAndRepeating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
      }
      Arrays.sort(arr);
      int sum1=0,sum2=0;
      for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
          if(arr[i]==arr[j]){
            System.out.print(arr[i]+" ");
          }
        }
      }
       int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }
      Arrays.sort(temp);
      
      for(int k=0;k<n-1;k++){
            sum1+=arr[k];
          }
          for(int k=1;k<=n;k++){
            sum2+=k;
          }
            System.out.print(sum2-sum1);
      
    }
}
