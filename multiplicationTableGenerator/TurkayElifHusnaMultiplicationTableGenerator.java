/*
@Title:	TurkayElifHusnaMultiplicationTableGenerator
@Author:    Turkay Elif Hüsna
@Date:   	9.12.2023
@Version:	1.0
*/

import java.util.Scanner;

class TurkayElifHusnaMultiplicationTableGenerator {
    public static void main(String[] args) {
      int enteredNum = 0;
      System.out.print("Enter your integer number:");
      printTable(userInput(enteredNum));
      
    }

    static int userInput(int enteredNum){
      Scanner keyboard = new Scanner(System.in);
      enteredNum = keyboard.nextInt();
      return enteredNum;
    }

    static void printTable(int enteredNum){
      int i = 1, process;
      while(i <= 10){
         process = enteredNum * i;
         System.out.println(enteredNum + " x " + i + " = " + process);
         i++;
      }
    }
}