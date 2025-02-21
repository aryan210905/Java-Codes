package Exp_1;

import java.util.Scanner;

public class Denominations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        int amount = sc.nextInt();      
        int hundred = amount / 100;
        amount %= 100;
        int fifty = amount / 50;
        amount %= 50;
        int ten = amount / 10;
        amount %= 10;
        int five = amount / 5;
        amount %= 5;
        int two = amount / 2;
        amount %= 2;
        int one = amount; 
                
        if (hundred > 0) System.out.println("100 x " + hundred);
        if (fifty > 0) System.out.println("50 x " + fifty);
        if (ten > 0) System.out.println("10 x " + ten);
        if (five > 0) System.out.println("5 x " + five);
        if (two > 0) System.out.println("2 x " + two);
        if (one > 0) System.out.println("1 x " + one);
        sc.close();
    }
}
