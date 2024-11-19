package org.example.task8;

import java.util.Stack;

public class TextEditorHistory {
    private final Stack<TextMemento> history = new Stack<>();

    // Сохранение снимка
    public void save(TextMemento memento) {
        history.push(memento);
    }

    // Восстановление последнего снимка
    public TextMemento undo() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null; // Если нет доступных снимков
    }
}
