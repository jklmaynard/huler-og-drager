import java.io.Console;

public class PlayerCharacter {
    private String playerName;
    private String playerClass;
    private String playerRace;
    private int playerLevel;

    private String[] AbilityScores;

    public PlayerCharacter(String playerClass) {
        this.playerClass = playerClass;
    }
    public void promptForDetails() {
        Console console = System.console();
        String playerName = console.readLine("Name your character? ");
        String playerRace = console.readLine("Race of your character? ");
        String playerLevel = console.readLine("Level of your character? ");

        console.printf("Your character's name is %s\n", playerName);
        this.playerName = playerName;
        
        console.printf("Your character's race is %s\n", playerRace);
        this.playerRace = playerRace;

        console.printf("Your character's level is %s\n", playerLevel);
        this.playerLevel = Integer.parseInt(playerLevel);
    }

    public String getPlayerName() {
        return this.playerName;
    }
}