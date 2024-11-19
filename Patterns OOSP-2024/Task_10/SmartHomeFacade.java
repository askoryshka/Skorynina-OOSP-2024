package org.example.task10;

public class SmartHomeFacade {
    private Light light;
    private Thermostat thermostat;
    private AudioSystem audioSystem;

    public SmartHomeFacade() {
        this.light = new Light();
        this.thermostat = new Thermostat();
        this.audioSystem = new AudioSystem();
    }

    // Включение режима "Домашний"
    public void homeMode() {
        light.turnOn();
        thermostat.setTemperature(22);
        audioSystem.playMusic();
        System.out.println("Режим 'Домашний' активирован.");
    }

    // Включение режима "Выход из дома"
    public void awayMode() {
        light.turnOff();
        thermostat.turnOff();
        audioSystem.stopMusic();
        System.out.println("Режим 'Выход из дома' активирован.");
    }
}
