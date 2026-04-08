package structural_patterns.flyweight;

import structural_patterns.flyweight.flyweighttype.GameCharacter;
import structural_patterns.flyweight.factory.CharacterFactory;

public class Main {

    public static void main(String[] args) {

        GameCharacter c1 = CharacterFactory.getCharacter('A');
        c1.display(1, 1);

        GameCharacter c2 = CharacterFactory.getCharacter('A');
        c2.display(2, 3);

        GameCharacter c3 = CharacterFactory.getCharacter('B');
        c3.display(4, 5);
    }
}