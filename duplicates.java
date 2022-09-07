import java.util.Scanner;

/**
 * duplicates
 */
public class duplicates {

    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        int res = getEle(A, n);
        System.out.println(res);
    }

    public static int getEle(int[] A, int n) {
        int flag = -1;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] == A[i]) {
                    System.out.println(A[j]+" ");
                } else {

                    flag =-1;
                }
            }
        }
        return -1;
    }
}