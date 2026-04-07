package structural_patterns.decorator.decoratortype;

import structural_patterns.decorator.component.Coffee;

public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 10;
    }
}