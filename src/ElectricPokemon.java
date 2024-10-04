import java.util.ArrayList;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    public static String type = "electric";
    private static List<String> attacks = new ArrayList<>(List.of("thunderpunch", "electroball", "thunder", "volttackle"));

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, ElectricPokemon.type, ElectricPokemon.attacks);
    }

    public void thunderPunch(Pokemon name, Pokemon enemy) {
        Pokemon.attack("thunderpunch", name, enemy);
    }

    public void electroBall(Pokemon name, Pokemon enemy) {
        Pokemon.attack("electroball", name, enemy);
    }

    public void thunder(Pokemon name, Pokemon enemy) {
        Pokemon.attack("thunder", name, enemy);
    }

    public void voltTackle(Pokemon name, Pokemon enemy) {
        Pokemon.attack("volttackle", name, enemy);
    }
}
