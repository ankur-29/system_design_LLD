package creational_patterns.abstractfactory.dark;

import creational_patterns.abstractfactory.ui.*;
import creational_patterns.abstractfactory.factory.UIFactory;

public class DarkUIFactory implements UIFactory {

    public Button createButton() {
        return new DarkButton();
    }

    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}
