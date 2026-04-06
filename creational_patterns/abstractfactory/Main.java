package creational_patterns.abstractfactory;

import creational_patterns.abstractfactory.ui.*;
import creational_patterns.abstractfactory.factory.UIFactory;

import creational_patterns.abstractfactory.dark.DarkUIFactory;
import creational_patterns.abstractfactory.light.LightUIFactory;

public class Main {

    public static void main(String[] args) {

        UIFactory factory;

        // Switch theme here
        factory = new DarkUIFactory();
        // factory = new LightUIFactory();

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();
    }
}
