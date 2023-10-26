//Elif Hüsna Turkay - 220543003
//UserRegistrationApp Exercise

import java.util.Scanner;
public class elifhusnaturkay {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String userName, password, passwordAgain;

        System.out.print("Enter username: ");
        userName = keyboard.next();
        System.out.print("Enter password: ");
        password = keyboard.next();
        System.out.print("Enter password again: ");
        passwordAgain = keyboard.next();
        if(password.equals(passwordAgain)){
            System.out.println("Your signup has complete succesfully.");
        }
        else {
            System.out.println("Passwords do not match. System ending...");
            System.exit(0);
        }

    }
}