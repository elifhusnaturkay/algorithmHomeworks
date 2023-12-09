
/***********************************************************************
 @Title:	TurkayElifHusnaConversion.java
 @Author:    (Turkay Elif Husna)
 @Date:   	(27.11.2023)
 @Version:	1.0
 ************************************************************************/

 import java.util.Scanner;

 public class TurkayElifHusnaConversion {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         System.out.print("Enter a distance in meters: ");
         double distanceInMeters = scanner.nextDouble();
 
         while (distanceInMeters < 0) {
             System.out.println("Distance cannot be negative. Please enter a non-negative distance.");
             System.out.print("Enter a distance in meters: ");
             distanceInMeters = scanner.nextDouble();
         }
 
         int choice;
         do {
             menu();
             System.out.print("Enter your choice: ");
             choice = scanner.nextInt();
 
             switch (choice) {
                 case 1:
                     System.out.println(distanceInMeters + " Meters is " + calcKilometers(distanceInMeters) + " kilometers.");
                     break;
                 case 2:
                     System.out.println(distanceInMeters + " Meters is " + calcInches(distanceInMeters) + " inches.");
                     break;
                 case 3:
                     System.out.println(distanceInMeters + " Meters is " + calcFeet(distanceInMeters) + " feet.");
                     break;
                 case 4:
                     System.out.println(distanceInMeters + " Meters is " + calcCentimeter(distanceInMeters) + " centimeters.");
                     break;
                 case 5:
                     System.out.println("Bye!");
                     break;
                 default:
                     System.out.println("Invalid choice. Please choose a number between 1 and 5.");
             }
         } while (choice != 5);
     }
 
     private static double calcKilometers(double meters) {
         return meters * 0.001;
     }
 
     private static double calcInches(double meters) {
         return meters * 39.37;
     }
 
     private static double calcFeet(double meters) {
         return meters * 3.281;
     }
     private static double calcCentimeter(double meters) {
         return meters / 100;
     }
 
     private static void menu() {
         System.out.println("---------------------------");
         System.out.println("1. Convert to kilometers.");
         System.out.println("2. Convert to inches.");
         System.out.println("3. Convert to feet.");
         System.out.println("4. Convert to centimeter.");
         System.out.println("5. Quit the program.");
     }
 }
 
