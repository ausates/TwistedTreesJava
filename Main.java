public class Main {
    
    public static void main(String[] args) {
        Character myCharacter = new Character("Austin", 100, 100, 100, 100, "rogue", "human");
        Character newBoss = new Character("Boss", 100, 100, 100, 100, "rogue", "human");
        Character oldBoss = new Character("Wizard", 100, 100, 100, 100, "rogue", "human");
        Character[] myCharArr = {myCharacter, newBoss, oldBoss};
        Character[] fightingCharacters = Character.getFighters(myCharArr);

        Fight roundOne = new Fight();
        roundOne.setCharacters(fightingCharacters);
        roundOne.fight();
        roundOne.getVictor();
    }
}
