import java.util.Scanner;

public class TurkayElifHusnaPizzaOrderCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double basePrice = 6.0;
        double toppingCost;
        double totalCost;

        System.out.print("Kaç adet topping istediğinizi giriniz: ");
        int numberOfToppings = keyboard.nextInt();

        if (numberOfToppings == 1) {
            toppingCost = 2.0; 
        } else if (numberOfToppings >= 2) {
            toppingCost = 1.5 * numberOfToppings;
        } else {
            toppingCost = 0.0; 
        }

        totalCost = basePrice + toppingCost;

        if (totalCost > 10) {
            totalCost = totalCost - (totalCost * 0.05); 
        }

        System.out.printf("Toplam ücret: $%.2f\n", totalCost);

        keyboard.close();
    }
   
}