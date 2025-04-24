package Exp_7;
import java.util.Scanner;
import java.util.Random;
import java.io.*;
public class Third {
    public static void main(String[] args) {
        File f = new File("Exp_7/Third.txt");
        try{
            if(!f.exists()){
                f.createNewFile();
            }
            FileWriter writer = new FileWriter(f);
            Random rand = new Random();
            // Generate 100 integers and write to file
            for(int i=0;i<100;i++){
                int x = rand.nextInt(500);
                writer.write(x+" ");
            }
            writer.close();

            // read file content
            Scanner s = new Scanner(f);
            while(s.hasNextLine()){
                System.out.println(s.nextLine());
            }
            s.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
