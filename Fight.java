import java.util.Scanner;

public class Fight {
    
    Character[] characters;

    public Character[] getCharacters() {
        return characters;
    }

    public void setCharacters(Character[] characters) {
        this.characters = characters;
    }

    public Character[] fight(){
        Scanner scan = new Scanner(System.in);
        Character[] characters = this.getCharacters();
        boolean fightOn = true;
        while(fightOn){
            for(byte i=0; i<characters.length; i++){
                if(characters[i].getHp() <= 0){
                    fightOn = false;
                }
            }
            if(!fightOn){
                System.out.println("Knock out! END Fight!");
                break;
            } else{
                for(byte i=0; i<characters.length; i++){
                    byte atk = (byte)(Math.random() * 25);
                    int charHp = characters[i].getHp();
                    characters[i].setHp(charHp - atk);
                    System.out.println(characters[i].getName() + " lost " + atk + " hp.");
                    if(characters[i].getHp() > 0){
                        System.out.println(characters[i].getName() + " has " + characters[i].getHp() + " HP.");
                    }else if(characters[i].getHp() <= 0){
                        System.out.println(characters[i].getName() + " has fainted.");
                        break;
                    }
                    
                    System.out.println("Press enter to continue");
                    scan.nextLine();
                }
            }
        }
        scan.close();
        return characters;
    }

    public Character getVictor(){
        Character[] characters = this.getCharacters();
        Character victor = new Character("test", -100, 0, 0, 0, "na", "na");
        for(byte i=0; i<characters.length; i++){
            if(characters[i].getHp() > victor.getHp()){
                victor = characters[i];
                continue;
            } else if(characters[i].getHp() == victor.getHp()){
                System.out.println("No Victor, characters had same HP");
            }
        }
        System.out.println("The victor is " + victor.getName());
        return victor;
    }

}
