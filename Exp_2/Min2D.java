package Exp_2;
import java.util.Scanner;
public class Min2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            int min = arr[i][0];
            int idxRow = 0;
            int idxCol = 0;
            for(int j=0;j<m;j++){
                if(min>arr[i][j]){
                    min = arr[i][j];
                    idxRow = i;
                    idxCol = j;
                }
            }
            System.out.println("Minimum element in row "+i+" is "+min+" at index ("+idxRow+","+idxCol+")");
        }
        sc.close();
    }   
}
