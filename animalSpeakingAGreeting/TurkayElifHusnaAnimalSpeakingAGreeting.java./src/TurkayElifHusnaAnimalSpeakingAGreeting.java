/*
@Title:	TurkayElifHusnaAnimalSpeakingAGreeting
@Purpose:	To get familiar with Java
@Author:    Elif Hüsna
@Date:   	31.10.2023
@Version:	1.0
*/
import java.util.Scanner;

public class TurkayElifHusnaAnimalSpeakingAGreeting {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String yourName = keyboard.nextLine();

        System.out.println("    /\\_/\\         ---------");
        System.out.println(" (   ‘  '  )    /   Hello  \\");
        System.out.println(" (    -    )   <    Coder   >");
        System.out.println("  |   |   |    \\    " + yourName + "   /");
        System.out.println("  (___|___)      ---------");


    }
}
