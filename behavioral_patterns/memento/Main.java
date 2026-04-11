package behavioral_patterns.memento;

import behavioral_patterns.memento.originator.TextEditor;
import behavioral_patterns.memento.caretaker.History;

public class Main {

    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        History history = new History();

        editor.setText("Hello");
        history.save(editor.save());

        editor.setText("Hello World");
        history.save(editor.save());

        editor.setText("Hello World!!!");

        System.out.println("---- Undo ----");

        editor.restore(history.undo());
        editor.restore(history.undo());
    }
}
