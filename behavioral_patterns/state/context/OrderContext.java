package behavioral_patterns.state.context;

import behavioral_patterns.state.states.OrderState;
import behavioral_patterns.state.states.CreatedState;

public class OrderContext {

    private OrderState state;

    public OrderContext() {
        state = new CreatedState(); // initial state
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
