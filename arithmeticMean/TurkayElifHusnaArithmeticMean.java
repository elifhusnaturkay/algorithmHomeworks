/**
@Title:	TurkayElifHusnaArithmeticMean
@Author:    Turkay Elif Hüsna
@Date:   	10.10.2023
@Version:	1.0
*/
import java.util.Scanner;
import java.util.ArrayList;

public class TurkayElifHusnaArithmeticMean {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How much number do you want to enter: ");
        int howMuchNumber = keyboard.nextInt();
        
        ArrayList<Double> numbers = new ArrayList<Double>();
        listAdder(howMuchNumber, numbers);
        double arithmeticCalculation = arithmeticCalculator(numbers, howMuchNumber);
        System.out.println("Your arithmetic = "+ arithmeticCalculation);
    }

    static void listAdder(int howMuchNumber, ArrayList<Double> numbers){
        Scanner keyboard = new Scanner(System.in);
        double numberAdder;

        for(int i=1; i<= howMuchNumber; i++){
            System.out.print("Please enter your number: ");
            numberAdder = keyboard.nextDouble();
            numbers.add(numberAdder);
        }
    }
    static double arithmeticCalculator(ArrayList<Double> numbers, int howMuchNumber){
        double total = 0;
        
        for(double number : numbers){
            total = total + number;
        }
        double arithmetic = total / howMuchNumber;
        return arithmetic;
    }

}