package Extras;
import java.util.Scanner;
public class MatrixMultiply {
    public static int[][] inputArray(Scanner sc) {

        System.out.print("Enter size of array: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];
        System.out.println("Enter elements of array: ");

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        return arr;
    }
    public static void matrixMultiply(int[][] arr,int [][] brr){
        int m = arr.length;
        int n = arr[0].length;
        int a = brr.length;
        int b = brr[0].length;
        //validating matrix multiplication
        if(n!=a){
            System.out.print("Matrix multiplication not possible");

        }
        else{
            int[][] crr = new int[m][b];
            for(int i=0;i<m;i++){
                for(int j=0;j<b;j++){
                    crr[i][j] = 0;
                    for(int k=0;k<a;k++){
                        crr[i][j] += arr[i][k] * brr[k][j];
                    }
                }
            }
            // display product matrix
            System.out.println("Matrix multiplication product: ");
            displayArray(crr);
        }
    }
    public static void displayArray(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // first array

        int[][] arr = inputArray(sc);

        // second array
        int[][] brr = inputArray(sc);

        matrixMultiply(arr,brr);
        sc.close();
    }
}
