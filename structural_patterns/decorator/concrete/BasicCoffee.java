package structural_patterns.decorator.concrete;

import structural_patterns.decorator.component.Coffee;

public class BasicCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public int getCost() {
        return 100;
    }
}