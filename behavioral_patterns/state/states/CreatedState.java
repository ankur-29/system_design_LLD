package behavioral_patterns.state.states;

import behavioral_patterns.state.context.OrderContext;

public class CreatedState implements OrderState {

    public void next(OrderContext context) {
        context.setState(new PaidState());
    }

    public void printStatus() {
        System.out.println("Order Created");
    }
}
