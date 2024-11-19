package org.example.task2;

public class ToyotaFactory extends CarFactory {
    @Override
    public Engine createEngine() {
        return new ToyotaEngine();
    }

    @Override
    public Wheel createWheel() {
        return new ToyotaWheel();
    }

    @Override
    public Body createBody() {
        return new ToyotaBody();
    }
}