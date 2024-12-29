import java.util.Random;

public class TurkayElifHusnaPugDogPopulation {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] population = new int[4][6];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                population[i][j] = random.nextInt(11);
            }
        }

        System.out.println("Population Data:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(population[i][j] + " ");
            }
            System.out.println();
        }

        int lastSpeciesPopulation = 0;
        for (int j = 0; j < 6; j++) {
            lastSpeciesPopulation += population[3][j];
        }
        System.out.println("\nLast species total: " + lastSpeciesPopulation);

        System.out.println("\nState totals:");
        for (int j = 0; j < 6; j++) {
            int stateTotal = 0;
            for (int i = 0; i < 4; i++) {
                stateTotal += population[i][j];
            }
            System.out.println("State " + (j + 1) + ": " + stateTotal);
        }

        System.out.println("\nEndangered species:");
        for (int i = 0; i < 4; i++) {
            int nonZeroStates = 0;
            for (int j = 0; j < 6; j++) {
                if (population[i][j] > 0) {
                    nonZeroStates++;
                }
            }
            if (nonZeroStates <= 3) {
                System.out.println("Species " + (i + 1));
            }
        }
    }
}
