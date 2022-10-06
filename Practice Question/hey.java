import java.util.Scanner;

public class hey {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i = 0; i < rows; i++){    
            int sumRow = 0;    
            for(int j = 0; j < cols; j++){    
              sumRow = sumRow + arr[i][j];    
            }    
                
            
            int sumCol = 0;    
            //Calculates sum of each column of given matrix    
            for(int i1 = 0; i1 < cols; i1++){    
                for(int j1 = 0; j1 < rows; j1++){    
                    sumCol = sumCol + arr[j1][i1];    
                }    
                System.out.println(sumCol-sumRow);    
            }    
            
        }
    }    
}
