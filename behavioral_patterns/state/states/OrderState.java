package behavioral_patterns.state.states;

import behavioral_patterns.state.context.OrderContext;

public interface OrderState {
    void next(OrderContext context);
    void printStatus();
}
