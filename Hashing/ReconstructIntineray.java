import java.util.HashMap;
import java.util.Scanner;

public class ReconstructIntineray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<String, String> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String str1 = sc.next();
            String str2 = sc.next();
            hm.put(str1, str2);
        }

        HashMap<String, Boolean> psrc = new HashMap<>();

        for (String src : hm.keySet()) {
            String dest = hm.get(src);

            psrc.put(dest, false);

            if (psrc.containsKey(src) == false) {
                psrc.put(src, true);
            }
        }

        String src = " ";
        for (String pot : psrc.keySet()) {
            Boolean val = psrc.get(pot);
            if (val) {
                src = pot;
                break;
            }
        }

        while (true) {
            if (psrc.containsKey(src) == true) { // or prsc ki jgah hm nho likh skte h, psrc se last wale ke baad null show krdega hm se nhi krega (goa->delhi->chennai->banglore->null.)
                System.out.print(src + "->");
                src = hm.get(src);
            } else {
                System.out.print(src+".");
                break;
            }
        }

    }
}
