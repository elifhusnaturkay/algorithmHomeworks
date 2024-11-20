/***********************************************************************
 @Title:	TurkayElifHusnaAdmissions.java
 @Author:   Turkay Elif Husna
 @Purpose:	To get familiar with file IO and writing methods
 @Date:   	27.11.2024
 @Version:	1.0
 ************************************************************************/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TurkayElifHusnaAdmissions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("SHSU Admissions Program");

        System.out.print("Please enter the name of the file that contains application records: ");
        String inputFileName = input.nextLine();

        System.out.print("Please enter the name of the file that should contain results: ");
        String outputFileName = input.nextLine();

        File inputFile = new File(inputFileName);
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + inputFileName);
            return;
        }

        PrintWriter outputFile = null;
        try {
            outputFile = new PrintWriter(outputFileName);
        } catch (FileNotFoundException e) {
            System.out.println("Could not open output file: " + outputFileName);
            return;
        }

        while (fileScanner.hasNextLine()) {
            String record = fileScanner.nextLine();
            String[] fields = record.split(" ");
            if (fields.length != 4) {
                System.out.println("Skipping invalid record: " + record);
                continue; 
            }
            String firstName = fields[0];
            String lastName = fields[1];
            int actScore;
            int satScore;
            try {
                actScore = Integer.parseInt(fields[2]);
                satScore = Integer.parseInt(fields[3]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid score format for: " + firstName + " " + lastName);
                continue; 
            }

            boolean isAdmitted = admitted(actScore, satScore);
            outputStatus(isAdmitted, firstName, lastName, actScore, satScore, outputFile);
        }

        fileScanner.close();
        outputFile.close();
    }

    public static boolean validAct(int score) {
        if (score < 0 || score > 30) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean validSat(int score) {
        if (score < 0 || score > 1600) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean metAct(int score) {
        if (score >= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean metSat(int score) {
        if (score >= 1000) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean admitted(int actScore, int satScore) {
        if (metAct(actScore) || metSat(satScore)) {
            return true;
        } else {
            return false;
        }
    }

    public static void outputStatus(boolean isAdmitted, String firstName, String lastName, int actScore, int satScore, PrintWriter outputFile) {
        if (isAdmitted) {
            if (metAct(actScore) && metSat(satScore)) {
                outputFile.println(firstName + " " + lastName + " is admitted on ACT and SAT scores");
            } else if (metAct(actScore)) {
                outputFile.println(firstName + " " + lastName + " is admitted on ACT score");
            } else if (metSat(satScore)) {
                outputFile.println(firstName + " " + lastName + " is admitted on SAT score");
            }
        } else {
            outputFile.println(firstName + " " + lastName + " is not admitted (ACT and SAT scores are below minimum)");
        }
    }
}
