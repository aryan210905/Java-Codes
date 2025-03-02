public class First {
    public static void checkPalindrome(String s) {
        String reversed = "";
        int n = s.length();
        
        for (int i = n - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        if (s.equals(reversed)) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }

    public static void main(String[] args) {
        if (args.length < 5) {
            System.out.println("Please provide at least 5 arguments.");
            return;
        }
        for (int i = 0; i < 5; i++) {
            checkPalindrome(args[i]);
        }
    }
}
