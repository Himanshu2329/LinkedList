import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=sc.nextInt(); 
        System.out.println("enter the number of cols");
        int m=sc.nextInt(); 

        ArrayList<String> paths=getmaze(1,1,n,m);
        System.out.println(paths);

        // sr- source row
        // sc- source col
        // dr- source row
        // dc- source col
    }

    private static ArrayList<String> getmaze(int sr,int sc,int dr,int dc) {
        if(sr==dr&&sc==dc){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> hpath=new ArrayList<>();
        ArrayList<String> vpath=new ArrayList<>(); 
        if(sc<dc){
            hpath =getmaze(sr, sc+1, dr, dc);

        }
        if(sr<dr){
            vpath=getmaze(sr+1, sc, dr, dc);
        }

        ArrayList<String> path=new ArrayList<>();
        for (String h : hpath) {
            path.add("h"+h);
        }
        for (String h : vpath) {
            path.add("v"+h);
        }
        return path;
    }
}
