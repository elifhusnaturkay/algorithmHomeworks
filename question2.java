import java.util.Arrays;

public class question2 {
    public static void main(String[] args) {
        int[] temperatures = new int[366];

        // Fill the array with randomly generated temperatures for each month
        fillTemperatures(temperatures);

        // Print the average temperature for each month
        printMonthlyAverages(temperatures);

        // Print the hottest day and coldest day for the entire year
        printHottestAndColdestDays(temperatures);

        // Count days below 33°F and above 75°F
        int daysBelow33 = countDaysBelowTemperature(temperatures, 33);
        int daysAbove75 = countDaysAboveTemperature(temperatures, 75);

        // Print the count of days below 33°F and above 75°F
        System.out.println("There were " + daysAbove75 + " days where the temperature was above 75 degrees");
        System.out.println("There were " + daysBelow33 + " days where the temperature was below 33 degrees");
    }

    // (Other methods here...)

    // Calculate the average temperature for a specific range in the temperatures array
    private static double calculateAverage(int[] temperatures, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += temperatures[i];
        }
        return (double) sum / (end - start + 1);
    }

    // Print the hottest and coldest days for the entire year
    private static void printHottestAndColdestDays(int[] temperatures) {
        int hottestDay = findMaxIndex(temperatures);
        int coldestDay = findMinIndex(temperatures);

        System.out.println("The hottest day in the entire year was on " + getDayOfWeek(hottestDay));
        System.out.println("It was " + temperatures[hottestDay] + " degrees F on this day.");

        System.out.println("The coldest day in the entire year was on " + getDayOfWeek(coldestDay));
        System.out.println("It was " + temperatures[coldestDay] + " degrees F on this day.");
    }

    // Count the number of days below a given temperature
    private static int countDaysBelowTemperature(int[] temperatures, int threshold) {
        return (int) Arrays.stream(temperatures).filter(temp -> temp < threshold).count();
    }

    // Count the number of days above a given temperature
    private static int countDaysAboveTemperature(int[] temperatures, int threshold) {
        return (int) Arrays.stream(temperatures).filter(temp -> temp > threshold).count();
    }

    // Find the index of the maximum temperature in the array
    private static int findMaxIndex(int[] temperatures) {
        int maxIndex = 0;
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > temperatures[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // Find the index of the minimum temperature in the array
    private static int findMinIndex(int[] temperatures) {
        int minIndex = 0;
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] < temperatures[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Get the day of the week for a given index (assuming January 1 was a Monday)
    private static String getDayOfWeek(int dayIndex) {
        String[] daysOfWeek = {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };
        return daysOfWeek[dayIndex % 7];
    }
}
