package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class GetCommonElement1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int arr[]=new int[n1];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int arr1[]=new int[n2];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int key:arr){
            if(hm.containsKey(key)){
                int oldFreq=hm.get(key);
                int newFeq=oldFreq+1;
                hm.put(key,newFeq);
            }else{
                hm.put(key, 1);
            }
        }

        for (int i : arr1) {
            if(hm.containsKey(i)){
                System.out.println(i);
                hm.remove(i);
            }
        }

    }
}
