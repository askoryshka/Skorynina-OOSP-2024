package org.example.task9;

public class DatabaseConnectionManager {
    private static DatabaseConnectionManager instance;
    private boolean isConnected;

    // Приватный конструктор, чтобы предотвратить создание экземпляров вне класса
    private DatabaseConnectionManager() {
        isConnected = false;
    }

    // Метод для получения единственного экземпляра класса
    public static synchronized DatabaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    // Метод для установления соединения (заглушка)
    public void connect() {
        if (!isConnected) {
            isConnected = true;
            System.out.println("Соединение установлено.");
        } else {
            System.out.println("Уже подключено.");
        }
    }

    // Метод для разрыва соединения (заглушка)
    public void disconnect() {
        if (isConnected) {
            isConnected = false;
            System.out.println("Соединение разорвано.");
        } else {
            System.out.println("Нет активного соединения для закрытия.");
        }
    }

    // Метод для проверки состояния соединения
    public boolean isConnected() {
        return isConnected;
    }
}

