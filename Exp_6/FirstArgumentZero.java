// exp 5
package Exp_6;
class ArgumentZero extends Exception{
    ArgumentZero(){super("First argument is zero!!");}
    ArgumentZero(String message){super(message);}
}
public class FirstArgumentZero {
    public static void main(String[] args) {
        try{
            if(args.length==0){
                throw new StringIndexOutOfBoundsException("Insufficient Input");
            }
            int i = Integer.parseInt(args[0]);
            if(i == 0){
                throw new ArgumentZero("You have entered the first argument as 0");
            }
            else{
                System.out.println("Good job! You entered non zero initial value");
            }
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(ArgumentZero e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{System.out.println("Exiting the program...");}
    }
}
