// exp 6
package Exp_6;
import java.util.Scanner;
class IllegalMarksException extends Exception{
    IllegalMarksException(){super("\nIllegal Marks Entry");}
    IllegalMarksException(String message){super(message);}
}
public class MarkLists{
    public static void checkMarks(int[] regNo, double[] marks) throws IllegalMarksException{
        for(int i=0;i<marks.length;i++){
            if(marks[i] <0){
                throw new IllegalMarksException();
            }            
        }
        for(int i=0;i<marks.length;i++){
            if(marks[i] >= 40){
                System.out.println(regNo[i] + " : PASS");
            }   
            else{
                System.out.println(regNo[i] + " : FAIL");
            }         
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of entries: ");
        int size = sc.nextInt();
        int[] regNo = new int[size];
        double[] marks = new double[size];        
        for(int i=0;i<size;i++){
            System.out.print("Enter Registration Number: ");
            regNo[i] = sc.nextInt();
            System.out.print("Enter marks: ");
            marks[i] = sc.nextDouble();
        }
        try{
            checkMarks(regNo, marks);
        }
        catch(IllegalMarksException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Something unexpected happened!");
        }
        finally{
            System.out.println("Exiting the program...");
        }
        sc.close();
    }
}