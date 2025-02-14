public class First {
    public static void checkPalindrome(String s){
        String s2 = "";
        int n = s.length();
        for(int i=n-1;i>=0;i--){
            s2 += s.charAt(i);
        }
        if(s2 == s){
            System.out.println(s+" is a palindrome");
        }
        else{
            System.out.println(s+" is not a palindrome");
        }

    }
    public static void main(String[] args) {
        String s1 = args[0];
        String s2 = args[1];
        String s3 = args[2];
        String s4 = args[3];
        String s5 = args[4];
        checkPalindrome(s1);
        checkPalindrome(s2);
        checkPalindrome(s3);
        checkPalindrome(s4);
        checkPalindrome(s5);
    }
}

