package behavioral_patterns.memento.originator;

import behavioral_patterns.memento.mementotype.Memento;

public class TextEditor {

    private String text;

    public void setText(String text) {
        this.text = text;
        System.out.println("Current Text: " + text);
    }

    public Memento save() {
        return new Memento(text);
    }

    public void restore(Memento memento) {
        this.text = memento.getState();
        System.out.println("Restored Text: " + text);
    }
}