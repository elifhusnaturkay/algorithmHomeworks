//Elif Hüsna Turkay - 220543003
//CurrencyConverter Exercise

import java.util.Scanner;
public class elifhusnaturkay {
    public static void main(String[] args) {
        double euroDollar = 1.08;
        double dollarEuro = 0.9259;
        double amount = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("press 1 for euro, press 2 for dollar");
        int choice = keyboard.nextInt();

        switch (choice){
            case 1:
                System.out.print("Please enter your money/Dollar: ");
                amount = keyboard.nextDouble();
                double convertToEuro = amount * dollarEuro;
                System.out.printf("Your amount is €%.1f\n", convertToEuro);
                break;
            case 2:
                System.out.print("Please enter your money/Euro: ");
                amount = keyboard.nextDouble();
                double convertToDollar = amount * euroDollar;
                System.out.printf("Your amount is $%.1f%n", convertToDollar);
                break;
        }
    }
}