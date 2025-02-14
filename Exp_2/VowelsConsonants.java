package Exp_2;
import java.util.Scanner;
public class VowelsConsonants {
    public static void findVowelsConsonants(String s){
        int noOfVowels = 0;
        int noOfConsonants = 0;
        int n = s.length();
        s = s.toLowerCase();
        s = s.trim();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                noOfVowels += 1;
            }
            else{
                noOfConsonants += 1;
            }
        }
        System.out.println("Number of vowels: "+noOfVowels);
        System.out.println("Number of consonants: "+noOfConsonants);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        findVowelsConsonants(s);
        sc.close();
    }   
}
