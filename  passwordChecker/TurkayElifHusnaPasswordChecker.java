/**
@Title:	TurkayElifHusnaPasswordChecker
@Author:    Turkay Elif Husna
@Date:   	10.10.2023
@Version:	1.0
*/
import java.util.Scanner;

public class TurkayElifHusnaPasswordChecker {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Please enter your ID: ");
            String userID = scanner.nextLine();

            System.out.print("Please enter your password: ");
            String password = scanner.nextLine();

            System.out.print("Please enter your password again: ");
            String passwordAgain = scanner.nextLine();

            if (password.equals(passwordAgain)) {
                System.out.println("Password is valid");
                break;
            } else {
                System.out.println("Passwords do not match. Try again.");
            }

        } while (true);

    }
}
