package creational_patterns.abstractfactory.light;

import creational_patterns.abstractfactory.ui.Button;

public class LightButton implements Button {
    public void render() {
        System.out.println("Light Button");
    }
}
