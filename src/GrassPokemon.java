import java.util.ArrayList;
import java.util.List;

public class GrassPokemon extends Pokemon {
    public static String type = "water";
    private static List<String> attacks = new ArrayList<>(List.of("leafstorm", "solarBeam", "leechseed", "leaveblade"));

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, GrassPokemon.type, GrassPokemon.attacks);
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        Pokemon.attack("leafstorm", name, enemy);
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        Pokemon.attack("solarbeam", name, enemy);
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        Pokemon.attack("leechseed", name, enemy);
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        Pokemon.attack("leaveblade", name, enemy);
    }
}

