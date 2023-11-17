/*
@Title:	TurkayElifHusnaEnergyCalculation
@Author:    Elif Hüsna
@Date:   	17.11.2023
@Version:	1.0
*/

import java.util.Scanner;
public class TurkayElifHusnaEnergyCalculation {
    public static void main(String[] args) {
        boolean repeater = true;
        double speedOfLight = 299800000;


        while (repeater == true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the mass in kilograms: ");
            double mass = input.nextDouble();
             

            if (mass >= 0){
                energyCalculation(mass, speedOfLight);
                repeater = false;
            }
            else {
                System.out.println("Mass has to be greater than 0, please try again.");
            }
        }
    }


    public static void energyCalculation(double mass, double speedOfLight ){
        double energy = mass * speedOfLight * speedOfLight;
        System.out.println("Energy produced by complete annihilation: " + energy + " Kilojoules");
    }
}