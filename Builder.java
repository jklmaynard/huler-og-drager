public class Builder {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Builder <player class>");
            System.exit(1);
        }

        PlayerCharacter character = new PlayerCharacter(args[0]);
        Roller roller = new Roller();
        // character.promptForDetails();
        roller.rollAbilityRoll();
    }
}