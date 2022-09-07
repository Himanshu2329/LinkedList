import java.util.Scanner;

public class FacingSun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
      }
      int count=0;
      int max=arr[0];
      for(int i=0;i<arr.length;i++){
        if(max<arr[i]||arr[i]==max){
          count++;
          max=arr[i];
        }
      }
      System.out.println(count);
    }
}
