package org.example.task2;

public class BMWFactory extends CarFactory {
    @Override
    public Engine createEngine() {
        return new BMWEngine();
    }

    @Override
    public Wheel createWheel() {
        return new BMWWheel();
    }

    @Override
    public Body createBody() {
        return new BMWBody();
    }
}