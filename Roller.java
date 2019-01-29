import java.util.Random;
import java.util.Arrays;
import java.io.Console;

public class Roller {


    public int roll6() {
        Random rand = new Random();
        return rand.nextInt((6-1)+1) + 1;
    }

    public int[] rollAbilityRoll(int numberOfRolls) {
        int[] initialRoll = new int[numberOfRolls];
        int[] outcome = new int[numberOfRolls-1];

        for (int i = 0; i < numberOfRolls; i++) {
            initialRoll[i] = roll6();
        }
        Arrays.sort(initialRoll);
        System.arraycopy(initialRoll, 1, outcome, 0, 3);
        
        return outcome;
    }





    public void rollAbilityScores() {
        Console console = System.console();
        // String outcome = Integer.toString(roll6());
        int[] outcome = rollAbilityRoll(4);
        int total = 0;

        for (int i = 0; i < outcome.length; i++) {
            total += outcome[i];
        }

        console.printf("rolling the outcome: %d and %d and %d for a total of %d %n ---------------------------------- %n", outcome[0], outcome[1], outcome[2], total);

    }

}