/*
@Title:	TurkayElifHusnaTipCalculator
@Author:    Elif Hüsna Turkay
@Date:   	08.11.2024
@Version:	1.0
*/
import java.util.Scanner;

public class TurkayElifHusnaTipCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Hesap tutarını giriniz: ");
        double check = keyboard.nextDouble();

        System.out.print("Bahşiş yüzdesini giriniz (0 - 100): ");
        int percentage = keyboard.nextInt();

        double tipAmount = check * percentage / 100;
        double totalAmount = check + tipAmount;

        if (percentage < 15) {
            System.out.println("Bu oran standartların altında.");
        } else if (percentage > 25) {
            System.out.println("Cömert davranıyorsunuz.");
        }

        System.out.printf("Bahşiş miktarı: %.2f\n", tipAmount);
        System.out.printf("Toplam tutar: %.2f\n", totalAmount);

        keyboard.close();
    }
}
