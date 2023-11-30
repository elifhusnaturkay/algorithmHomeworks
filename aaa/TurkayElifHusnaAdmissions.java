/***********************************************************************
 @Title:	TurkayElifHusnaAdmissions.java
 @Author:    (Turkay Elif Husna)
 @Date:   	(27.11.2023)
 @Version:	1.0
 ************************************************************************/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TurkayElifHusnaAdmissions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SHSU Admission Program\n");

        // Get input and output file names
        System.out.print("Please enter the name of the file containing application records: ");
        String inputFileName = scanner.nextLine();

        System.out.print("Enter the name of the file that will contain the results: ");
        String outputFileName = scanner.nextLine();

        // Create an instance of the AdmissionsProcessor class
        AdmissionsProcessor processor = new AdmissionsProcessor();

        // Perform admission processing
        processor.performAdmissionProcessing(inputFileName, outputFileName);

        System.out.println("\nAdmission process completed. Check the results in the output file.");
    }
}

class AdmissionsProcessor {
    private int actScore;
    private int satScore;

    public void performAdmissionProcessing(String inputFileName, String outputFileName) {
        try (Scanner fileScanner = new Scanner(new File(inputFileName));
             PrintWriter writer = new PrintWriter(outputFileName)) {

            // Process each line in the input file
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] record = line.split(" ");

                // Extract student information
                String firstName = record[0];
                String lastName = record[1];
                int actScore = Integer.parseInt(record[2]);
                int satScore = Integer.parseInt(record[3]);

                // Check admission status
                boolean admissionStatus = isAdmitted(actScore, satScore);

                // Write the results to the output file
                writeResult(admissionStatus, firstName + " " + lastName, writer);
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }

    private boolean isValidAct(int score) {
        return score >= 0 && score <= 30;
    }

    private boolean isValidSat(int score) {
        return score >= 0 && score <= 1600;
    }

    private boolean meetsMinAct(int score) {
        return score >= 20;
    }

    private boolean meetsMinSat(int score) {
        return score >= 1000;
    }

    private boolean isAdmitted(int actScore, int satScore) {
        return meetsMinAct(actScore) || meetsMinSat(satScore);
    }

    private void writeResult(boolean admissionStatus, String studentInfo, PrintWriter writer) {
        if (admissionStatus) {
            writer.println(studentInfo + " admitted ("
                    + (meetsMinAct(actScore) ? "ACT" : "") + (meetsMinAct(actScore) && meetsMinSat(satScore) ? " and " : "")
                    + (meetsMinSat(satScore) ? "SAT" : "") + " scores)");
        } else {
            writer.println(studentInfo + " not admitted (ACT and SAT scores are below minimum requirements)");
        }
    }
}
