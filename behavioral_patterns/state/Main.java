package behavioral_patterns.state;

import behavioral_patterns.state.context.OrderContext;

public class Main {

    public static void main(String[] args) {

        OrderContext order = new OrderContext();

        order.printStatus(); // Created

        order.nextState();
        order.printStatus(); // Paid

        order.nextState();
        order.printStatus(); // Shipped

        order.nextState(); // Already shipped
    }
}