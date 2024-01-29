import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class FileIOExamples{
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args){
        try{
            System.out.println("please enter 3 sentences.");
            String enterance1 = keyboard.nextLine();
            String enterance2 = keyboard.nextLine();
            String enterance3 = keyboard.nextLine();
            keyboard.close();

            File dosya = new File("metindosyasi.txt");

            PrintWriter writer = new PrintWriter(dosya);

            writer.println(enterance1);
            writer.println(enterance2);
            writer.println(enterance3);
            writer.close();

            System.out.println("writing succesfully");

            Scanner fileScanner = new Scanner(new File("metindosyasi.txt"));
            String line;
            while(fileScanner.hasNextLine()){
                line = fileScanner.nextLine();
                System.out.println(line);
            }
            fileScanner.close();
        }
        catch (Exception e){
            System.out.println("problem is: " + e);
        }

    }
}

