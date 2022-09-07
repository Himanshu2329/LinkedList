import java.util.ArrayList;
import java.util.Scanner;

public class GetKeypadCombo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ArrayList<String> words= getkpc(str);
        System.out.println(words);
    }
    static String[] codes={
        ",;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"
    };
    private static ArrayList<String> getkpc(String str) {
        if(str.length()==0){
            ArrayList<String> bres= new ArrayList<>();
            bres.add("");
            return bres;

        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String>rres=getkpc(ros);
        ArrayList<String> myres=new ArrayList<>();

        String codeForCh=codes[ch-48];
        for (int i = 0; i < codeForCh.length(); i++) {
            char chcode=codeForCh.charAt(i);
            for (String rste : rres) {
                myres.add(chcode+rste);
                
            }
        }




        return myres;
    }
}
