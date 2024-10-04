import java.util.ArrayList;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    public static String type = "electric";
    private static List<String> attacks = new ArrayList<>(List.of("thunderpunch", "electroball", "thunder", "volttackle"));

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, ElectricPokemon.type, ElectricPokemon.attacks);
    }

    public void thunderPunch(Pokemon name, Pokemon enemy) {
        Pokemon.attack("thunderpunch", name, enemy, 14);
    }

    public void electroBall(Pokemon name, Pokemon enemy) {
        Pokemon.attack("electroball", name, enemy, 10);
    }

    public void thunder(Pokemon name, Pokemon enemy) {
        if (enemy.getType().equals(ElectricPokemon.type)) {
            enemy.setHp(enemy.getHp() + 10);
            System.out.println(enemy.getName() + "gained 10 hp from thunder");
            return;
        }
        Pokemon.attack("thunder", name, enemy, 17);
    }

    public void voltTackle(Pokemon name, Pokemon enemy) {
        Pokemon.attack("volttackle", name, enemy, 12);
    }
}
