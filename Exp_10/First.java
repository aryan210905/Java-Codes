// convert decimal to binary string by recursion
package Exp_10;
import java.util.Scanner;
public class First {
    
    public static String dec2Bin(int value) {   
        if (value == 0) {
            return "0";
        }
        if (value == 1) {
            return "1";
        }
        return dec2Bin(value / 2) + (value % 2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();        
        if (decimal < 0) {
            System.out.println("Please enter a non-negative number.");
        } else{
            System.out.println("Binary equivalent: " + dec2Bin(decimal));
        }        
        input.close();
    }
}
