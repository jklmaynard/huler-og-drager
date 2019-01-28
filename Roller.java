import java.util.*;
import java.io.Console;

public class Roller {


    public int roll6() {
        Random rand = new Random();
        return rand.nextInt((6-1)+1) + 1;
    }


    // NEXT STEP: UNDERSTAND ARRAYS TO FINISH THIS METHOD
    // public void rollAbilityRoll() {
    //     Console console = System.console();
    //     Random rand = new Random();
    //     ArrayList abilityArray = new ArrayList();

    //     for (int i = 0; i < abilityArray.length; i++) {
    //         abilityArray[i] = roll6();
    //     }

    //     console.printf("rolling first ability score roll: \n");
    //     abilityArray.forEach(System.out::println);
    // }

    public void rollAbilityScores() {
        Console console = System.console();
        String outcome = Integer.toString(roll6());

        console.printf("rolling the outcome: %s\n", outcome);

    }

}