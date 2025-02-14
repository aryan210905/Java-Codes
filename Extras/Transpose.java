package Extras;
import java.util.Scanner;
public class Transpose {
    public static int[][] transpose(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        int[][] transpose = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                transpose[i][j] = arr[j][i];
            }
        }
        return transpose;
    }
    public static void display(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0;i<m;i++){
            for(int j = 0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] transpose = transpose(arr);
        System.out.println("Transpose: ");
        display(transpose);
        sc.close();
    }
}
