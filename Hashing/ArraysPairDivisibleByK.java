import java.util.HashMap;
import java.util.Scanner;

public class ArraysPairDivisibleByK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        solution(arr,n,k);
    }

    private static void solution(int[] arr, int n, int k) {
        HashMap<Integer,Integer> fmap=new HashMap<>();

        for(int val:arr){
            int rem=val%k;

            fmap.put(rem,fmap.getOrDefault(rem,0)+1);
            
        }

        for(int val:arr){
            int rem=val%k;
            if(rem==0){
                int freq=fmap.get(rem);
                if(freq%2==1){
                    System.out.println(false);
                    return;
                }
                
            }
            else if(2*rem==k){
                int freq=fmap.get(rem);
                if(freq%2==1){
                    System.out.println(false);
                    return;
                }
                
            }else{
                int freq=fmap.get(rem);
                int oldf=fmap.getOrDefault(k-rem,0);
                if(freq!=oldf){
                    System.out.println(false);
                    return;
                    
                }
            }
        }
        System.out.println(true);
        return;
        
    }
}
