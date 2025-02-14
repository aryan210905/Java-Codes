package Extras;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum = 1;
        for(int i=1;i<=n;i++){
            System.out.print(a + " ");
            sum = a+b;
            a = b;
            b = sum;
        }
        sc.close();
    }
}
