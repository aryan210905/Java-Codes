// exp 1
package Exp_6;
import java.util.Scanner;

public class DivideByZero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value: ");
        int n = sc.nextInt();
        System.out.print("Enter second value: ");
        int m = sc.nextInt();
        try{
            double ans = n/m;
            System.out.println(ans);
        }
        catch(ArithmeticException e){
            System.out.print("Second number cannot be 0");
        }
        catch(Exception e){
            System.out.println("Something unexpected happened!");
        }
        sc.close();
    }
}