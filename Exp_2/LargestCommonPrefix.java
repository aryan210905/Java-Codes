package Exp_2;
import java.util.Scanner;
public class LargestCommonPrefix {
    public static String LCP(String s1, String s2){
        String lcp = "";
        int n = s1.length();
        int m = s2.length();
        int i=0;
        int j=0;
        if(n>m){
            while(i<m){
                if(s1.charAt(i) == s2.charAt(j)){
                    lcp = lcp + s1.charAt(i);
                }
                else{
                    break;
                }
                i++;
                j++;
            }   
        }
        else if(n<m){
            while(j<n){
                if(s1.charAt(i) == s2.charAt(j)){
                    lcp = lcp + s2.charAt(j);
                }
                else{break;}
                i++;
                j++;
            }   
        }
        else{            
            while(i!=n){
                if(s1.charAt(i) == s2.charAt(j)){
                    lcp = lcp + s1.charAt(i);
                }
                else{break;}
                i++;
                j++;
            } 
        }
        return lcp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter second string: ");
        String s2 = sc.next();
        String lcp = LCP(s1,s2);
        if(lcp.isEmpty()) System.out.println("No common prefix");
        else   System.out.println("Largest common prefix: "+lcp);
        sc.close();
    }
}
