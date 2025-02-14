package Exp_2;
import java.util.Scanner;
public class ZeroesOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][6];
        System.out.println("Enter the array: ");
        for (int i =0;i<6;i++){
            for(int j=0;j<6;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i =0;i<6;i++){
            int no1 = 0;
            for(int j=0;j<6;j++){
                if(arr[i][j]==1) no1++;
            }
            if(no1 % 2 != 0){
                System.out.println("Row number "+ (i+1) + " has odd number of ones. " +
                        "Number of ones are : " + no1);
            }
        }
        for (int i =0;i<6;i++){
            int no2 = 0;
            for(int j=0;j<6;j++){
                if(arr[j][i]==1) no2++;
            }
            if(no2 % 2 != 0){
                System.out.println("Column number "+ (i+1) + " has odd number of ones. " +
                        "Number of ones are : " + no2);
            }
        }
        sc.close();


    }
}
