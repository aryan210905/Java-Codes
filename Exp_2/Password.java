package Exp_2;
import java.util.Scanner;
public class Password {
    public static void checkPass(String s){
        if(s.length()<8){
            System.out.println("Invalid password! Password should contain atleast 8 characters ");
            return;
        }
        int countDigits = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                countDigits += 1;
            }
        }
        if(countDigits<2){
            System.out.println("Invalid password! Password should contain atleast 2 digits");
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                System.out.println("Invalid password! Password should contain only a digit or an alphabet  ");
                return;
            }
        }
        System.out.println("Your password is valid ");
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String s = sc.next();
        checkPass(s);
        sc.close();
    }
}
