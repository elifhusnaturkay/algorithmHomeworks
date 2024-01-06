/***
 @Title:    CilMustafaConversion.java
 @Purpose:    WritingConversionProgram
 @Author:    (CilMustafa)
 @Date:       (25.11.2023)
 @Version:    1.0
 **/

import java.util.Scanner;
public class aaa {
    public static void main (String[] arg){
        // class nesne yapıları için örnekler
        Scanner keyboard = new Scanner(System.in);
        ElifimCokSeviorum askim = new ElifimCokSeviorum();
        askim.askIlani();
        PrintfExample printfExample = new PrintfExample();
        printfExample.ornek();


        // döngüler için örnekler
        for (int i = 0; i < 5; i++) {
            System.out.println("1.Döngü değeri: " + i);
        }

        int i = 0;
        while (i < 5) {
            System.out.println("2. Döngü değeri: " + i);
            i++;
        }

        int j = 0;
        do {
            System.out.println("3.Döngü değeri: " + i);
            j++;
        } while (j < 5);

        //print mevzusu
        System.out.println("aaaa"  + "aaaa");
        System.out.printf("aaaa"  + "aaaa");
        System.out.print(" aaaa"  + "aaaa");

    }
}
class ElifimCokSeviorum{
    String sentence = "elifim seni çok seviyorum";
    void askIlani(){
        System.out.println(sentence);
    }
}

class PrintfExample {
        String adi = "Ahmet";
        int yas = 25;
        double ortalama = 85.5;
        void ornek() {
        System.out.printf("Merhaba, %s! Yaşınız: %d, Ortalamanız: %.2f%n", adi, yas, ortalama);
    }
}