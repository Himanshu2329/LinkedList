import java.util.Scanner;

/**
 * Matter
 */
public class Matter {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                String str=sc.nextLine();
                String s1="";
                for(int i = 0; i < str.length(); i++)
		{
			if(Character.isUpperCase(str.charAt(i))){
                                s1+=Character.isLowerCase(str.charAt(i));
                        }
                        else{
                                s1+=Character.isUpperCase(str.charAt(i));
                        }
		}		
                System.out.println(s1);
    }
}
