package org.example.task9;

public class Main {
    public static void main(String[] args) {
        // Получаем экземпляр менеджера подключения
        DatabaseConnectionManager dbManager = DatabaseConnectionManager.getInstance();

        // Устанавливаем соединение
        dbManager.connect(); // Вывод: Соединение установлено.

        // Повторное подключение (не создаст новое соединение)
        dbManager.connect(); // Вывод: Уже подключено.

        // Отключаем соединение
        dbManager.disconnect(); // Вывод: Соединение разорвано.

        // Повторное отключение (проверка состояния)
        dbManager.disconnect(); // Вывод: Нет активного соединения для закрытия.
    }
}
