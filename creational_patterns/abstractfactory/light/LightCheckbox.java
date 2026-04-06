package creational_patterns.abstractfactory.light;

import creational_patterns.abstractfactory.ui.Checkbox;

public class LightCheckbox implements Checkbox {
    public void render() {
        System.out.println("Light Checkbox");
    }
}
