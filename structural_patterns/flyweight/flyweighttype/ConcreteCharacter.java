package structural_patterns.flyweight.flyweighttype;

public class ConcreteCharacter implements GameCharacter {

    private char symbol; // intrinsic (shared)

    public ConcreteCharacter(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Character: " + symbol + " at (" + x + ", " + y + ")");
    }
}