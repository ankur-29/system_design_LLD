package structural_patterns.decorator;

import structural_patterns.decorator.component.Coffee;
import structural_patterns.decorator.concrete.BasicCoffee;
import structural_patterns.decorator.decoratortype.*;

public class Main {

    public static void main(String[] args) {

        Coffee coffee = new BasicCoffee();

        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.getDescription());
        System.out.println("Total Cost: " + coffee.getCost());
    }
}