public class Builder {
    public static void main(String[] args) {
        Roller roller = new Roller();
        PlayerCharacter character = new PlayerCharacter(args[0]);

        if (args.length == 0) {
            System.out.println("Usage: java Builder <player class>");
            System.exit(1);
        }

        for (int i = 0; i < 6; i++) {
            roller.rollAbilityScores();
        }

        character.promptForDetails();

    }
}