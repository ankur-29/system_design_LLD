package behavioral_patterns.visitor.element;

import behavioral_patterns.visitor.visitors.Visitor;

public class Book implements ItemElement {

    private int price;
    private String name;

    public Book(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}