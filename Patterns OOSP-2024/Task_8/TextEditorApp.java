package org.example.task8;

public class TextEditorApp {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        TextEditorHistory history = new TextEditorHistory();

        // Установка текста и сохранение состояния
        editor.setText("Первая версия текста.");
        history.save(editor.save());

        // Изменение текста и сохранение состояния
        editor.setText("Вторая версия текста.");
        history.save(editor.save());

        // Изменение текста без сохранения состояния
        editor.setText("Третья версия текста.");

        System.out.println("Текущий текст: " + editor.getText());

        // Восстановление предыдущих состояний
        editor.restore(history.undo());
        System.out.println("После отката 1: " + editor.getText());

        editor.restore(history.undo());
        System.out.println("После отката 2: " + editor.getText());
    }
}
