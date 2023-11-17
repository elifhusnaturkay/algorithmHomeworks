/*
@Title:	TurkayElifHusnaFallingDistance
@Author:    Elif Hüsna
@Date:   	17.11.2023
@Version:	1.0
*/
import java.util.Scanner;
public class TurkayElifHusnaFallingDistance {
    public static void main(String[] args) {
        boolean repeater = true;
        while (repeater == true) {
            Scanner keyboard = new Scanner(System.in);

            System.out.print("Enter the time: ");
            double time = keyboard.nextDouble();

            if (time >= 1 && time <= 10) {
                System.out.println("Your distance is: " + fallingDistance(time));
                repeater = false;
            }
             else {
                System.out.println("Please choose a time between 1 and 10. Please try again.");
            }
        }
    }

    static double fallingDistance(double time){
        double distance = 0;
        double gravitationalConstant = 9.8;
        distance = gravitationalConstant * time * time / 2;
        return distance;
    }
}
