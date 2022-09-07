import java.util.Scanner;

public class asdasd {
    public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //   int n=sc.nextInt();
    //   int m=sc.nextInt();
    //   int arr[][]=new int[n][m];
    //   for(int i=0;i<arr.length;i++){
    //     for(int j=0;j<arr[0].length;j++){
    //       arr[i][j]=sc.nextInt();
    //     }
    //   }
    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        
      }
      int x=sc.nextInt();
      int flag=0;
      for(int i=0;i<arr.length;i++){
        if(x==arr[i]){
          System.out.println(i);
        }
      }
      if(flag==1){
        System.out.println("NOT FOUND");
      }
    }
}
