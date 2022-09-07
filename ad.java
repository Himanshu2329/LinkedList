import java.util.Scanner;

public class ad {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int arr[]=new int[n];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i]=sc.nextInt();
        // }
        // int k=sc.nextInt();
        // int res=0;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
                
        //         if(arr[j]==k){
        //             res=1;
        //         }
        //     }
        // }

        // if(res==1){
        //     System.out.println("yes");
        // }else{
        //     System.out.println("No");

        // }
      //   Scanner sc=new Scanner(System.in);
      // int n=sc.nextInt();
      // int arr[]=new int[n];
      // for(int i=0;i<arr.length;i++){
      //   arr[i]=sc.nextInt();
      // }
      // int flag=0;
      // for(int i=0;i<arr.length;i++){
      //   for(int j=i+1;j<arr.length;j++){
      //     if(arr[i]==arr[j]){
      //       flag++;
      //     }
      //   }
      // }
      // if(flag>1){
      //   System.out.println("true");
      // }else{
      //   System.out.println("false");
        
      // }
      // Scanner sc=new Scanner(System.in);
      // int n=sc.nextInt();
      // int m=sc.nextInt();
      // int arr[][]=new int[n][m];
      // for(int i=0;i<arr.length;i++){
      //   for(int j=0;j<arr[0].length;j++){
      //     arr[i][j]=sc.nextInt();
      //   }
      // }
      // int sum=0;
      
      // for(int i=0;i<n;i++){
      //   for(int j=0;j<m;j++){
      //     sum+=arr[i][j];
      //   }
      // }
      // System.out.println(sum);


    //   time conversion
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
  
     int h1 = (int)str.charAt(1) - '0';
    int h2 = (int)str.charAt(0) - '0';
    int hh = (h2 * 10 + h1 % 10);
 
    // If time is in "AM"
    if (str.charAt(8) == 'A')
    {
        if (hh == 12)
        {
            System.out.print("00");
            for (int i = 2; i <= 7; i++)
                System.out.print(str.charAt(i));
        }
        else
        {
            for (int i = 0; i <= 7; i++)
                System.out.print(str.charAt(i));
        }
    }
 
    // If time is in "PM"
    else
    {
        if (hh == 12)
        {
            System.out.print("12");
            for (int i = 2; i <= 7; i++)
                System.out.print(str.charAt(i));
        }
        else
        {
            hh = hh + 12;
            System.out.print(hh);
            for (int i = 2; i <= 7; i++)
                System.out.print(str.charAt(i));
        }
    }  
    }
}
