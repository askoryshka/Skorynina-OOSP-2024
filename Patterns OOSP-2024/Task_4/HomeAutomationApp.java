package org.example.task4;

public class HomeAutomationApp {
    public static void main(String[] args) {
        // Создаем умную розетку
        SmartDevice smartSocket = new SmartSocket();

        // Создаем адаптер для умной розетки, чтобы управлять ею через старое устройство
        OldDeviceController socketAdapter = new SmartDeviceAdapter(smartSocket);

        // Управляем умной розеткой с помощью адаптера
        socketAdapter.powerOn();  // Умная розетка включена.
        socketAdapter.powerOff(); // Умная розетка выключена.
    }
}
