package behavioral_patterns.state.states;

import behavioral_patterns.state.context.OrderContext;

public class PaidState implements OrderState {

    public void next(OrderContext context) {
        context.setState(new ShippedState());
    }

    public void printStatus() {
        System.out.println("Order Paid");
    }
}