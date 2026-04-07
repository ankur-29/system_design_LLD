package structural_patterns.decorator.decoratortype;

import structural_patterns.decorator.component.Coffee;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 20;
    }
}
