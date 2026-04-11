package behavioral_patterns.visitor.visitors;

import behavioral_patterns.visitor.element.*;

public class ShoppingCartVisitor implements Visitor {

    public int visit(Book book) {
        int cost = book.getPrice();
        System.out.println("Book cost: " + cost);
        return cost;
    }

    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + " cost: " + cost);
        return cost;
    }
}