import java.util.*;

public class MarcCakewalk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[i] < arr[j]) {
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }
        // Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr);
        long ans=0;
        int x=0;
        for (int i = arr.length-1; i >=0; i--) {
            ans+=arr[i]*Math.pow(2,x);
            x++;
        }
        System.out.println(ans);
        // long ans=0;
        // for (int i = 0; i < arr.length; i++) {
        //     ans += ((long)arr[n-i-1])<<i;
        // }
        // System.out.println(ans);
    }
}
