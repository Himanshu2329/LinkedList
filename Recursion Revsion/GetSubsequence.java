import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.metal.MetalRadioButtonUI;

public class GetSubsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ArrayList<String> res= gss(str);
        System.out.println(res);
    }
    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> bres= new ArrayList<>();
            bres.add("");
            return bres;

        }
        char ch=str.charAt(0);
        String ros=str.substring(1);  
        ArrayList<String> rres=gss(ros);

        ArrayList<String> mres= new ArrayList<>(); 

        for(String val:rres){
            mres.add(""+val);
        }
        for (String val : rres) {
            mres.add(ch+val);
            
        }

        return mres;

    }
}
