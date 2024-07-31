package DSA.Arrays.PracticeQuestions;

import java.util.Scanner;

public class EnergyCalculator {
    public static int funcEnergy(int initialEnergy, int rate, int timeN) {
        // Calculate the energy at the Nth second
        return initialEnergy + rate * (timeN - 1);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input for initialEnergy
        int initialEnergy = in.nextInt();

        // Input for rate
        int rate = in.nextInt();

        // Input for timeN
        int timeN = in.nextInt();

        // Calculate the result using funcEnergy
        int result = funcEnergy(initialEnergy, rate, timeN);

        // Print the result
        System.out.print(result);

        in.close();
    }
}

