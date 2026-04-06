package creational_patterns.abstractfactory.dark;

import creational_patterns.abstractfactory.ui.*;

public class DarkButton implements Button {
    public void render() {
        System.out.println("Dark Button");
    }
}
