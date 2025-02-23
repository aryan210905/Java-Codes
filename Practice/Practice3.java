import java.util.Scanner;
public class Practice3 {
    public static String toUpper(String str){
        String uppered = "";
        int n = str.length();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch>=97 && ch<=122){
                int ascii = (int)ch;
                ascii -= 32;
                uppered = uppered + (char)ascii;
            }
            else{
                uppered = uppered + str.charAt(i);
            }
        }
        return uppered;
    }
    public static String toLower(String str){
        String lowered = "";
        int n = str.length();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch>=65 && ch<=90){
                int ascii = (int)ch;
                ascii += 32;
                lowered = lowered + (char)ascii;
            }
            else{
                lowered = lowered + str.charAt(i);
            }
        }
        return lowered;
    }
    public static boolean palindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.next();
        
        System.out.println("Uppered string: "+ toUpper(str));
        
        System.out.println("Lowered string: "+ toLower(str));
        str = toLower(str);
        System.out.println("Is a palindrome?: "+ palindrome(str));

        sc.close();
    }
}
