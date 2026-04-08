package structural_patterns.flyweight.factory;

import structural_patterns.flyweight.flyweighttype.*;
import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {

    private static Map<Character, GameCharacter> cache = new HashMap<>();

    public static GameCharacter getCharacter(char c) {

        if (!cache.containsKey(c)) {
            cache.put(c, new ConcreteCharacter(c));
        }

        return cache.get(c);
    }
}