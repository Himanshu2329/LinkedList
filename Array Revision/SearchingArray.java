import java.util.Scanner;

public class SearchingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int number=sc.nextInt();
        int idx=-1;
        for (int i = 0; i < arr.length; i++) {
            if (number==arr[i]) {
                idx=i;
                break;
            } 
        }
        System.out.println(idx);

    }
}
