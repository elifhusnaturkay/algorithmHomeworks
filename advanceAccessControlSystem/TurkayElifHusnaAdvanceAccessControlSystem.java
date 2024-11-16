/**
@Title:	TurkayElifHusnaAdvanceAccessControlSystem
@Author:    Turkay Elif Husna
@Date:   	13.11.2024
@Version:	1.0
*/
import java.util.Scanner;

public class TurkayElifHusnaAdvanceAccessControlSystem {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the security level (1-5): ");
        int securityLevel = scanner.nextInt();

        System.out.println("Enter the role (ADMIN, USER, GUEST): ");
        String role = scanner.next().toUpperCase();

        System.out.println("Enter the time of day (0-23): ");
        int hour = scanner.nextInt();

        if (securityLevel < 1 || securityLevel > 5) {
            System.out.println("Access Denied");
        } else if (securityLevel == 5) {
            System.out.println("Access Granted");
        } else if (role.equals("ADMIN") && securityLevel >= 4) {
            System.out.println("Access Granted");
        } else if (role.equals("USER") && securityLevel >= 3 && hour >= 9 && hour <= 17) {
            System.out.println("Access Granted");
        } else if (role.equals("GUEST") && securityLevel >= 2 && hour >= 10 && hour <= 16) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied");
        }
        
       scanner.close();
    }
}
