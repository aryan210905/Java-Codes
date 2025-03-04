// exp 2
package Exp_6;
import java.util.Scanner;
public class Second {
    public static void checkAge(int age) throws ArithmeticException{
        if(age<18){
            throw new ArithmeticException("You are ineligible");
        }
        else{
            System.out.println("You are eligible");
        }
    }
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);        
        try{
            int age = Integer.parseInt(args[0]);
            if(age<0){
                throw new ArithmeticException("Negative age not possible");
            }
            checkAge(age);
        }
        catch(NumberFormatException e){
            System.out.println("Enter valid age in integers only.");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Something unexpected happened!");
        }
        finally{
            sc.close();
            System.out.println("Exiting the program....");
        }
        
    }
}
