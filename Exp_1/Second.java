package Exp_1;
import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,c,d,e,f,x,y;
        System.out.println("First expression: ax+by=e: ");
        System.out.println("Enter values of a,b,e: ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        e = sc.nextFloat();
        System.out.println("Second expression: cx+dy=f: ");
        System.out.println("Enter values of c,d,f: ");
        c = sc.nextFloat();
        d = sc.nextFloat();
        f = sc.nextFloat();

        x = ((e*d)-(b*f))/((a*d)-(b*c));
        y = ((a*f)-(e*c))/((a*d)-(b*c));

        System.out.println("X = " + x + " Y = " + y);
        sc.close();
    }

}
