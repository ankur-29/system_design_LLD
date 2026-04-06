package solid_principles.lsp.good_example;

import solid_principles.lsp.good_example.model.*;

public class Main {

    public static void main(String[] args) {

        FlyingBird sparrow = new Sparrow();
        sparrow.fly(); // ✅ works

        Bird ostrich = new Ostrich();
        System.out.println("Ostrich cannot fly, but no error occurs");
    }
}