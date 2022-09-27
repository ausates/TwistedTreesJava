public class Character{
    private String name;
    private int hp;
    private int mana;
    private int attack;
    private int strength;
    private String cls;
    private String race;

    public Character(String name, int hp, int mana, int attack, int strength, String cls, String race){
        this.name = name;
        this.hp = hp;
        this.mana = mana;
        this.attack = attack;
        this.strength = strength;
        this.cls = cls;
        this.race = race;
    }

    public String getName(){
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMana() {
        return mana;
    }

    public int getAttack() {
        return attack;
    }

    public int getStrength() {
        return strength;
    }

    public String getCls() {
        return cls;
    }

    public String getRace(){
        return race;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public static Character[] getFighters(Character[] myCharArr){
        int Min = 0;
        int Max = 2;
        int randomNumber1 = Min + (int)(Math.random() * ((Max - Min) + 1));
        int randomNumber2 = Min + (int)(Math.random() * ((Max - Min) + 1));
        if (randomNumber1 == randomNumber2){
            randomNumber1 = 2;
            randomNumber2 = 1;
        }
        Character fighter1 = myCharArr[randomNumber1];
        Character fighter2 = myCharArr[randomNumber2];
        Character[] fighters = {fighter1, fighter2};
        return fighters;
    }
}