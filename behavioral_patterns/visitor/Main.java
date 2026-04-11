package behavioral_patterns.visitor;

import behavioral_patterns.visitor.element.*;
import behavioral_patterns.visitor.visitors.*;

public class Main {

    public static void main(String[] args) {

        ItemElement[] items = new ItemElement[] {
            new Book(500, "Design Patterns"),
            new Fruit(100, 2, "Apple"),
            new Fruit(50, 3, "Banana")
        };

        Visitor visitor = new ShoppingCartVisitor();

        int total = 0;

        for (ItemElement item : items) {
            total += item.accept(visitor);
        }

        System.out.println("Total Cost: " + total);
    }
}