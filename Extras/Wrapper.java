package Extras;
import java.util.Scanner;
public class Wrapper {
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Integer i = Integer.valueOf(x);
        String s = Integer.toString(i);
        System.out.println(s);
        System.out.println(s.getClass());
        sc.close();
    }
}
