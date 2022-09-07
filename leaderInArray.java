import java.util.Scanner;

public class leaderInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
      }
      for (int i = 0; i < size; i++) 
        {
            int j;
            for (j = i + 1; j < size; j++) 
            {
                if (arr[i] <=arr[j])
                    break;
            }
            if (j == size) // the loop didn't break
                System.out.print(arr[i] + " ");
        }
    }
}
