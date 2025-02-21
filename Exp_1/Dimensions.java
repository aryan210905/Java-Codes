package Exp_1;
import java.util.Scanner;
public class Dimensions {
    public int square(int n){
        return n*n;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double weightPounds,heightInches,weightKgs,heightMeters;
        System.out.print("Enter weight in pounds: ");
        weightPounds = sc.nextDouble();
        System.out.print("Enter height in inches: ");
        heightInches = sc.nextDouble();

        weightKgs = weightPounds * 0.45359237;
        heightMeters = heightInches * 0.0254;

        double heightSq = heightMeters * heightMeters;
        double bmi = weightKgs / heightSq;
        System.out.println("Your BMI is " + bmi);
        sc.close();
    }
}
