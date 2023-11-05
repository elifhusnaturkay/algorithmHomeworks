/**
 @Title:	TurkayElifHusnaCalculateSyllables
 @Purpose:	To get familiar with loop and conditional structures in Java.
 @Author:   Turkay Elif Hüsna
 @Date:   	02.11.2023
 @Version:	1.0
 */
import java.util.Scanner;

public class TurkayElifHusnaCalculateSyllables{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = keyboard.next().toLowerCase();
        keyboard.close();

        int syllableCount = 0;
        boolean isVowel = false;
        String vowels = "aeiouy";

        for (char letter : word.toCharArray()) {
            if (vowels.indexOf(letter) != -1) {
                if (!isVowel) {
                    syllableCount++;
                }
                isVowel = true;
            } else {
                isVowel = false;
            }
        }

        if (syllableCount == 0) {
            syllableCount = 1;
        }

        System.out.println("The word '" + word + "' has " + syllableCount + " syllable(s).");
    }
}
