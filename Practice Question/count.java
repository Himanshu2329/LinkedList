import java.util.Scanner;
import java.util.zip.CRC32;

public class count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        String str=sc.nextLine();
        int count=0,digi=0,spl=0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))){
                
                count++;
            }
        }

        for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				count++;
			}
			else if(ch >= '0' && ch <= '9') {
				digi++;
			}
			else {
				spl++;
			}
		}		
        System.out.println(count);
        System.out.println(digi);
        System.out.println(spl);
    }
}
