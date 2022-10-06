import java.util.Scanner;

public class heyyyyy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(printS(s));
    }
    static int printS(String S){
           for(int i=0;i<S.length();i++){
                if(S.charAt(i)=='1'){
                    return i;
                }
                
                
            }
                

        return -1;
        
    }
}
 
//  how to add two linked list in java ?



