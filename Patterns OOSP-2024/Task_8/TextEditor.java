package org.example.task8;

public class TextEditor {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    // Метод для создания снимка текущего состояния текста
    public TextMemento save() {
        return new TextMemento(text);
    }

    // Метод для восстановления состояния текста из снимка
    public void restore(TextMemento memento) {
        this.text = memento.getText();
    }
}
