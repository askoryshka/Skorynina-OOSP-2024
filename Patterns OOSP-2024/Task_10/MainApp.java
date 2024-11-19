package org.example.task10;

public class MainApp {
    public static void main(String[] args) {
        SmartHomeFacade smartHome = new SmartHomeFacade();

        // Включаем режим "Домашний"
        smartHome.homeMode();

        // Включаем режим "Выход из дома"
        smartHome.awayMode();
    }
}
