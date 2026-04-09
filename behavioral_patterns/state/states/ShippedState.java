package behavioral_patterns.state.states;

import behavioral_patterns.state.context.OrderContext;

public class ShippedState implements OrderState {

    public void next(OrderContext context) {
        System.out.println("Order already shipped");
    }

    public void printStatus() {
        System.out.println("Order Shipped");
    }
}
