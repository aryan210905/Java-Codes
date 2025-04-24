package Practice;
import java.io.*;
import java.util.Scanner;
public class CopyFile {
    public static void main(String[] args) {
        File f1 = new File("Practice/file1.txt");
        File f2 = new File("Practice/file2.txt");
        try{
            Scanner s1 = new Scanner(f1);
            FileWriter writer = new FileWriter(f2);
            while(s1.hasNextLine()){
                String line = s1.nextLine();
                writer.write(line+"\n");
            }
            s1.close();
            writer.close();
            Scanner s2 = new Scanner(f2);
            while(s2.hasNextLine()){
                StringBuilder line = new StringBuilder(s2.nextLine());
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println("Error while file handling");
        }
    }
}
