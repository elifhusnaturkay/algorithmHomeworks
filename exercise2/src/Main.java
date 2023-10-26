// Elif Hüsna Turkay - 220543003
// Algorithm and Programming
// 21.10.2023
// Exercise 1 - Tip Calculator

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your check amount: ");
        double check = keyboard.nextDouble();
        System.out.print("Please enter the percantage of your tip: ");
        int percentage = keyboard.nextInt();

        if (percentage < 0 || percentage > 100){
            System.out.println("Wrong! system closing...");
            System.exit(0);
        }
        double tipAmount = check * percentage / 100;
        System.out.println("You want to tip: " + tipAmount);
        if (percentage <= 15){
            JOptionPane.showMessageDialog(null, "thanks.");
        } else if (percentage >= 25) {
            JOptionPane.showMessageDialog(null, "you are so generous");
        }
        else {
            JOptionPane.showMessageDialog(null, "thanks for your tip!");
        }

    }
}