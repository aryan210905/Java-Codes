package Exp_2;
import java.util.Scanner;
public class AddMultiplySubtract {
    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    public static void addMatrix(int[][] arr, int[][] brr){
        int n = arr.length;
        int m = arr[0].length;
        int[][] crr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                crr[i][j] = arr[i][j] + brr[i][j];
            }
        }
        printArray(crr);
    }
    public static void subtractMatrix(int[][] arr, int[][] brr){
        int n = arr.length;
        int m = arr[0].length;
        int[][] crr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                crr[i][j] = arr[i][j] - brr[i][j];
            }
        }
        printArray(crr);
    }   
    public static void multiplyMatrix(int[][] arr, int[][] brr){
        int n = arr.length;
        int m = arr[0].length;
        int[][] crr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                crr[i][j] = 0;
                for(int k=0;k<n;k++){
                    crr[i][j] += arr[i][k] * brr[k][j];
                }
            }
        }
        printArray(crr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=3,m=3;
        System.out.println("Enter array 1 elements: ");
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter array 2 elements: ");
        int[][] brr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                brr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter operator (+,-,*): ");
        String ch = sc.next();
        System.out.println(ch);
        if(ch.equals("+")){
            addMatrix(arr, brr);
        }
        else if(ch.equals("-")){
            subtractMatrix(arr, brr);
        }
        else if(ch.equals("*")){
            multiplyMatrix(arr,brr);
        }
        sc.close();
    }
}
