package org.example.task2;

public class CarProductionApp {
    public static void main(String[] args) {
        // Производим компоненты для Toyota
        CarFactory toyotaFactory = new ToyotaFactory();
        Engine toyotaEngine = toyotaFactory.createEngine();
        Wheel toyotaWheel = toyotaFactory.createWheel();
        Body toyotaBody = toyotaFactory.createBody();

        // Вызываем методы для компонентов Toyota
        toyotaEngine.design();
        toyotaWheel.design();
        toyotaBody.design();

        // Производим компоненты для BMW
        CarFactory bmwFactory = new BMWFactory();
        Engine bmwEngine = bmwFactory.createEngine();
        Wheel bmwWheel = bmwFactory.createWheel();
        Body bmwBody = bmwFactory.createBody();

        // Вызываем методы для компонентов BMW
        bmwEngine.design();
        bmwWheel.design();
        bmwBody.design();
    }
}
