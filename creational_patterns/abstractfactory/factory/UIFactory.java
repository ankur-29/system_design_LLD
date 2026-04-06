package creational_patterns.abstractfactory.factory;

import creational_patterns.abstractfactory.ui.*;

public interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}