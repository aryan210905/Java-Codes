
class CustomException extends Exception{
    CustomException(){}
    CustomException(String message){super(message);}
}
public class Practice6 {
    public static void main(String[] args) {
        
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            
            if(a/b == 0){
                throw new CustomException("Output is zero");
            }
            else{
                System.out.println(a/b);
            }
        }
        catch(NumberFormatException e){
            System.out.println("Incorrect format");
        }
        catch(ArithmeticException e){
            System.out.println("Second number cannot be 0");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Enter atleast 2 inputs");
        }
        catch(CustomException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Some error occured");
        }
        finally{
            System.out.println("In finally block");
        }

        
    }   
}
