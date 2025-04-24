package Practice;
import java.util.Scanner;
import java.io.*;
public class FileHandling1 {
    
    public static void main(String[] args) {
        File f1 = new File("Practice/myFile1.txt");
        try{
            // create file
            f1.createNewFile();
            System.out.println("Created file");

            // write to a file
            FileWriter fileWriter = new FileWriter("Practice/myFile1.txt");
            fileWriter.write("This is my first write\nWelcome!");
            fileWriter.close();

            // read a file
            
            FileReader fileReader = new FileReader("Practice/myFile1.txt");
            Scanner sc = new Scanner(fileReader);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }

        catch(IOException e){
            System.out.println("Error while accessing file");
        }
        
        
        
    }
}
