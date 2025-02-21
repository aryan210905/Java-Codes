package Exp_1;
import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch;
        System.out.println("Enter character: ");
        ch = sc.next();
        if (ch.equals("A") || ch.equals("E") || ch.equals("I") ||
                ch.equals("O") || ch.equals("U") ||
                ch.equals("a") || ch.equals("e") || ch.equals("i") ||
                ch.equals("o") || ch.equals("u") ) {
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
        sc.close();
    }
}
