/***********************************************************************
@Title:   TurkayElifHusnaFindTheNumber.java
@Purpose: To get familiar with loops and conditional statements
@Author:  Turkay Elif Husna
@Date:    28.11.2024
@Version: 1.0
************************************************************************/

import java.util.Random;
import java.util.Scanner;

public class TurkayElifHusnaNameFindTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] secretCode = new int[4];
        boolean hasWon = false;

        for (int i = 0; i < 4; i++) {
            int nextDigit;
            boolean isUnique;
            do {
                isUnique = true;
                nextDigit = random.nextInt(6) + 1;
                for (int j = 0; j < i; j++) {
                    if (secretCode[j] == nextDigit) {
                        isUnique = false;
                        break;
                    }
                }
            } while (!isUnique);
            secretCode[i] = nextDigit;
        }

        System.out.println("4 basamaklı gizli bir kod oluşturdum. Her basamak 1-6 arasında ve tekrarsızdır.");
        System.out.println("Toplam 10 deneme hakkınız var. Tahminlerinizi yapın!");

        for (int attempt = 1; attempt <= 10; attempt++) {
            System.out.print("Deneme " + attempt + ": ");
            int guess = scanner.nextInt();

            int[] guessArray = new int[4];
            for (int i = 3; i >= 0; i--) {
                guessArray[i] = guess % 10;
                guess /= 10;
            }

            String feedback = "";
            for (int i = 0; i < 4; i++) {
                if (guessArray[i] == secretCode[i]) {
                    feedback += "+";
                } else {
                    for (int j = 0; j < 4; j++) {
                        if (guessArray[i] == secretCode[j] && i != j) {
                            feedback += "-";
                            break;
                        }
                    }
                }
            }

            System.out.println("Geri Bildirim: " + feedback);

            if (feedback.equals("++++")) {
                System.out.println("Tebrikler! " + attempt + ". denemede doğru tahmini yaptınız!");
                hasWon = true;
                break;
            }
        }

        if (!hasWon) {
            System.out.print("Maalesef, hakkınız doldu. Gizli kod şuydu: ");
            for (int digit : secretCode) {
                System.out.print(digit);
            }
            System.out.println();
        }
    }
}
