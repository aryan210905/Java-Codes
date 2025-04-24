package Exp_7;
import java.io.*;
import java.util.Scanner;
public class First {
    public static void main(String[] args) {
        File f1 = new File("Exp_7/First.txt");
        Scanner sc = new Scanner(System.in);
        try{
            f1.createNewFile();
            
            // enter content in file
            FileWriter fileWriter = new FileWriter(f1);
            System.out.println("Enter content of the file: ");
            String inputString = sc.nextLine();
            fileWriter.write(inputString);
            fileWriter.close();
            

            System.out.println("\nEnter string to remove from file: ");
            String text = sc.nextLine();

            StringBuilder updatedContent = new StringBuilder();            
            Scanner s = new Scanner(f1);            
            while(s.hasNextLine()){
                String line = s.nextLine();
                if(line.contains(text)){
                    String updatedLine = line.replace(text, "");
                    updatedContent.append(updatedLine).append("\n");
                }              
            }
            s.close();

            FileWriter updater = new FileWriter(f1);
            updater.write(updatedContent.toString().trim());
            updater.close();
            System.out.println("\nSuccessfully removed " + text + " from the file.");

            System.out.println("\n\nNew contents of file are: ");
            Scanner s2 = new Scanner(f1);
            while(s2.hasNextLine()){
                System.out.println(s2.nextLine());
            }
            s2.close();
        }
        catch(IOException e){
            System.out.println("Error while file handling! ");
        }
    }
}
