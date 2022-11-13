import java.util.*;

public class MaxOccuringCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        HashMap<Character,Integer>hm=new HashMap<>();
        for (int i = 0; i <n; i++) {
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }

            
        }
        int max=0;
        char ans=' ';
        for (Character ch : hm.keySet()) {
            if(max<hm.get(ch)){
                max=hm.get(ch);
                ans=ch;
            }
        }

        System.out.println(ans+" "+max);
    }
}
