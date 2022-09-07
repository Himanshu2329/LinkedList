import java.util.Scanner;
import java.util.Stack;

public class count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String res=getEle(str);
        System.out.println(res);
    }
    // public static String getEle(String str) {
    //     String words[]=str.split("\\s");  
    //     String reverseWord="";  
    //     String sus="";
    //     for(String w:words){  
    //     StringBuilder sb=new StringBuilder(w);  
    //     sb.reverse();  
    //     reverseWord+=sb.toString()+" ";  
    //     sus+=reverseWord.substring(0,1).toUpperCase()+reverseWord.substring(1 );
    //     }  
    //     return sus;  
    // }
    static int minOperations(String []arr, int N)
    {
        Stack<String> st = new Stack<>();
    
        for(int i = 0; i < N; i++)
        {
            
            if (arr[i] == "../" && !st.empty())
            {
                
                           
                st.pop();
            }
    
            
            else if (arr[i] != "./")
            {
                
                
                st.push(arr[i]);
            }
        }
        return st.size();
    }

}
