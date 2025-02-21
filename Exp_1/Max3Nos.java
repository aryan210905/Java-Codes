package Exp_1;
import java.util.Scanner;
public class Max3Nos {
    public static void func(int a, int b, int c) {
        if(a>b && a>c){     // a is max
            if(b>c){        // b is second max
                System.out.println(a+" "+b+" "+c);
            }
            else{       // c is second max
                System.out.println(a+" "+c+" "+b);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter 3 numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        func(a,b,c);
        func(b,a,c);
        func(c,a,b);


        sc.close();
    }
}
