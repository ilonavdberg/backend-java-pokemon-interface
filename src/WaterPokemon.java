import java.util.ArrayList;
import java.util.List;

public class WaterPokemon extends Pokemon {
    public static String type = "water";
    private static List<String> attacks = new ArrayList<>(List.of("surf", "hydropump", "hydrocanon", "raindance"));

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, WaterPokemon.type, WaterPokemon.attacks);
    }

    public void surf(Pokemon name, Pokemon enemy) {
        Pokemon.attack("surf", name, enemy, 12);
    }

    public void hydroPump(Pokemon name, Pokemon enemy) {
        Pokemon.attack("hydropump", name, enemy, 14);
    }

    public void hydroCanon(Pokemon name, Pokemon enemy) {
        Pokemon.attack("hydrocanon", name, enemy, 16);
    }

    public void rainDance(Pokemon name, Pokemon enemy) {
        if (enemy.getType().equals(ElectricPokemon.type)) {
            System.out.println("Raindance has no effect on " + enemy.getName());
            return;
        }
        if (enemy.getType().equals(WaterPokemon.type)) {
            enemy.setHp(enemy.getHp() + 10);
            System.out.println(enemy.getName() + "gained 10 hp from raindance");
            return;
        }
        Pokemon.attack("raindance", name, enemy, 10);
    }
}
