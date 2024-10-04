import java.util.ArrayList;
import java.util.List;

public class FirePokemon extends Pokemon {
    public static String type = "fire";
    private static List<String> attacks = new ArrayList<>(List.of("surf", "hydropump", "hydrocanon", "raindance"));

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, FirePokemon.type, FirePokemon.attacks);
    }

    public void inferno(Pokemon name, Pokemon enemy) {
        Pokemon.attack("inferno", name, enemy);
    }

    public void pyroBall(Pokemon name, Pokemon enemy) {
        Pokemon.attack("pyroball", name, enemy);
    }

    public void fireLash(Pokemon name, Pokemon enemy) {
        Pokemon.attack("firelash", name, enemy);
    }

    public void flameThrower(Pokemon name, Pokemon enemy) {
        Pokemon.attack("flamethrower", name, enemy);
    }
}
