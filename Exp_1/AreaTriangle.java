package Exp_1;
import java.util.Scanner;
import java.lang.Math;
public class AreaTriangle{
    public static double areaTriangle(float a, float b, float c){
        float s = (a+b+c)/2;
        double areaSquared = s*(s-a)*(s-b)*(s-c);
        return Math.sqrt(areaSquared);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter each side of the triangle: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        System.out.println("Area : " + areaTriangle(a,b,c) + " m^2");
        sc.close();
    }
}
