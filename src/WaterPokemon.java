import java.util.ArrayList;
import java.util.List;

public class WaterPokemon extends Pokemon {
    public static String type = "water";
    private static List<String> attacks = new ArrayList<>(List.of("surf", "hydropump", "hydrocanon", "raindance"));

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, WaterPokemon.type, WaterPokemon.attacks);
    }

    public void surf(Pokemon name, Pokemon enemy) {
        Pokemon.attack("surf", name, enemy);
    }

    public void hydroPump(Pokemon name, Pokemon enemy) {
        Pokemon.attack("hydropump", name, enemy);
    }

    public void hydroCanon(Pokemon name, Pokemon enemy) {
        Pokemon.attack("hydrocanon", name, enemy);
    }

    public void rainDance(Pokemon name, Pokemon enemy) {
        Pokemon.attack("raindance", name, enemy);
    }
}
