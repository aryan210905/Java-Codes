package Exp_1;
import java.util.Scanner;
public class Tenth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Pattern 1.");
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.print("Enter n2: ");
        int n2 = sc.nextInt();
        System.out.println("Pattern 2.");
        for(int i=n2;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }

        System.out.print("Enter n3: ");
        int n3 = sc.nextInt();
        System.out.println("Pattern 3.");
        int a=1;
        for(int i=n3;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(a);
                a+=1;
            }
            System.out.print("\n");
        }

        System.out.println("Pattern 4.");
        System.out.print("Enter n4: ");
        int n4 = sc.nextInt();
        int nsp = n4-1;
        int nst = 1;
        for(int i = 1; i<=2*n4-1;i++)
        {
            for(int j=1;j<=nsp;j++)
            {
                System.out.print(" ");
            }
            for(int k =1;k<=nst;k++)
            {
                System.out.print("*");
            }
            if (i < n4) {
                nsp--;
                nst += 2;
            } else {
                nsp++;
                nst -= 2;
            }
            System.out.print("\n");
        }

        sc.close();
    }
}
