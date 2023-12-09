/**
 @Title:	TurkayElifHusnaCalculateGrades
 @Purpose:	To practice java loop and conditional statements.
 @Author:   Turkay Elif Hüsna
 @Date:   	31.10.2023
 @Version:	1.0
 */
import java.util.Scanner;

public class TurkayElifHusnaCalculateGrades {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        boolean calculateForAnotherStudent = true;

        while (calculateForAnotherStudent) {
            System.out.print("Please enter your midterm exam grade: ");
            double midterm = keyboard.nextDouble();

            System.out.print("Please enter your final exam grade: ");
            double finalExam = keyboard.nextDouble();

            System.out.print("Please enter Assignment #1 grade: ");
            double assignment1 = keyboard.nextDouble();

            System.out.print("Please enter Assignment #2 grade: ");
            double assignment2 = keyboard.nextDouble();

            System.out.print("Please enter Assignment #3 grade: ");
            double assignment3 = keyboard.nextDouble();

            System.out.print("Please enter the lab grade before the midterm exam: ");
            double labBeforeMidterm = keyboard.nextDouble();

            System.out.print("Please enter the lab grade after the midterm exam: ");
            double labAfterMidterm = keyboard.nextDouble();

            double weightedMidterm = (midterm * 0.6) + (assignment1 * 0.1) + (assignment2 * 0.1) + (labBeforeMidterm * 0.2);
            double weightedFinal = (finalExam * 0.6) + (assignment3 * 0.2) + (labAfterMidterm * 0.2);

            double finalGrade = (weightedMidterm * 0.5) + (weightedFinal * 0.5);

            System.out.println("Final Course Grade is: " + finalGrade);

            System.out.print("Do you want to calculate for another student?  Please type true or false.");
            calculateForAnotherStudent = keyboard.nextBoolean();
            System.out.println("Bye bye!");
        }
    }
}