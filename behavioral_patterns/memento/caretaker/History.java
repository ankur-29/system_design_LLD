package behavioral_patterns.memento.caretaker;

import behavioral_patterns.memento.mementotype.Memento;
import java.util.Stack;

public class History {

    private Stack<Memento> history = new Stack<>();

    public void save(Memento memento) {
        history.push(memento);
    }

    public Memento undo() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
