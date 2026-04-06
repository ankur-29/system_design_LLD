package creational_patterns.abstractfactory.light;

import creational_patterns.abstractfactory.ui.*;
import creational_patterns.abstractfactory.factory.UIFactory;

public class LightUIFactory implements UIFactory {

    public Button createButton() {
        return new LightButton();
    }

    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}
