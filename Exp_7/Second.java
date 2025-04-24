package Exp_7;
import java.io.*;
import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter File Name: ");
        String fileName = sc.nextLine();

        try{
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            int countCharacters = 0;
            int countWords = 0;
            int countLines = 0;
            while(s.hasNextLine()){
                countLines+=1;
                
                String currentLine = s.nextLine();
                String[] words = currentLine.split(" ");
                countWords += words.length;
                
                for(String i : words){
                    String[] letters = i.split("");
                    countCharacters += letters.length;
                }

            }
            s.close();
            System.out.println("\nNumber of lines: "+countLines);
            System.out.println("Number of words: "+countWords);
            System.out.println("Number of characters: "+countCharacters);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
