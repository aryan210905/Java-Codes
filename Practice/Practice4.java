import java.util.Scanner;
public class Practice4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1 = sc.next();
        System.out.println("Enter second string: ");
        String s2 = sc.next();
        Integer i1 = Integer.valueOf(s1);
        Integer i2 = Integer.valueOf(s2);
        System.out.println(Integer.sum(i1,i2));
        System.out.println(Integer.sum(i1,(-1*i2)));
        
        sc.close();
    }
}