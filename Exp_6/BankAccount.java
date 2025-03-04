// exp 3
package Exp_6;
import java.util.Scanner;
class LowBalance extends Exception{
    LowBalance(){super("Insufficient Balance");}
    LowBalance(String message){super(message);}
}
public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        int amt = sc.nextInt();
        try{
            while(true){
                System.out.println("Current Balance: "+amt);
                System.out.print("Enter amount to withdraw(-1 to exit): ");                
                int wd = sc.nextInt();
                if(wd == -1){
                    break;
                }
                if(wd > amt){
                    throw new LowBalance("You have insufficent balance");
                }
                amt -= wd;
                System.out.println("Successfully withdrawn\n");
            }
        }
        catch(LowBalance e){
            System.out.println(e.getMessage());
        }
        catch(NumberFormatException e){
            System.out.println("Enter only integral inputs! ");
        }
        catch(Exception e){
            System.out.println("Something unexpected happened!");
        }
        finally{
            System.out.println("Exiting the system. Thank you for coming!");
            sc.close();
        }
        
    }
}
