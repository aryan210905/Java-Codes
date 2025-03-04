// exp 4
package Exp_6;

public class AverageMethod {
    public static double average(String[] a) throws NullPointerException, NumberFormatException{
        if(a.length == 0){
            throw new NullPointerException("No numbers entered!");
        }
        int n = a.length;
        double[] result = new double[n];
        
        for(int i=0;i<n;i++){
            double d = Double.parseDouble(a[i]);
            result[i] = d;          
        }
        double sum = 0;
        for (double i : result){
            sum += i;
        }
        double avg = sum/n;
        return avg;
    }
    public static void main(String[] args) {
        try{
            System.out.println(average(args));
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch(NumberFormatException e){
            System.out.println("Enter only double values");
        }
        catch(Exception e){
            System.out.println("Something unexpected occured");
        }
        finally{
            System.out.println("Exiting the program..");
        }
    }
}
