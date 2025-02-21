package Exp_1;
import java.util.Scanner;
public class Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length in meters: ");
        double meters = sc.nextDouble();
        double feet = meters * 3.28;
        System.out.println("Length in feet = "+feet);
        sc.close();
    }
}
