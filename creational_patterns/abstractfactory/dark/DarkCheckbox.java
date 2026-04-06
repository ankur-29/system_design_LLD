package creational_patterns.abstractfactory.dark;

import creational_patterns.abstractfactory.ui.Checkbox;

public class DarkCheckbox implements Checkbox {
    public void render() {
        System.out.println("Dark Checkbox");
    }
}
