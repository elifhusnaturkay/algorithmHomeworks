import java.util.Scanner;

public class TurkayElifHusnaPositiveIntegerCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Please enter a positive integer number: ");
            number = scanner.nextInt();

            if (number < 0) {
                System.out.println("You entered an incorrect number. Please enter a positive integer.");
            } else {
                break;
            }
        }

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        scanner.close();
    }
}
