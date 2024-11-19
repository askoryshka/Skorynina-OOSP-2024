package org.example.task4;

public class SmartSocket implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Умная розетка включена.");
    }

    @Override
    public void turnOff() {
        System.out.println("Умная розетка выключена.");
    }
}
