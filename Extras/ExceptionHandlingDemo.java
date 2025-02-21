package Extras;
public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try{
            if(args.length<2){
                throw new ArrayIndexOutOfBoundsException("Less than 2 arguments");
            }
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);            
            if(b == 0){
                throw new ArithmeticException("Second argument can't be zero");
            }
            double quotient;
            quotient = a/b;
            System.out.println(quotient);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(NumberFormatException e){
            System.out.println("Invalid argument data type");
        }
        catch(IllegalArgumentException e){            
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }       
        catch(Exception e){
            System.out.println("Some error occured!");
        }
        finally{
            System.out.println("In finally block");
        }
    }
}
