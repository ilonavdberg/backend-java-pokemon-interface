import java.util.List;

public abstract class Pokemon {
    private String name;
    private int level;
    private int hp;
    private String food;
    private String sound;
    private String type;
    private List<String> attacks;

    public Pokemon(String name, int level, int hp, String food, String sound, String type, List<String> attacks) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
        this.type = type;
        this.attacks = attacks;
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public static void attack(String attack, Pokemon attacker, Pokemon defender) {
        System.out.println(attacker.getName() + " attacked " + defender.getName() + " with " + attack);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

}
