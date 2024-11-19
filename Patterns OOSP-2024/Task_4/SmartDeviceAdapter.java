package org.example.task4;

public class SmartDeviceAdapter implements OldDeviceController {
    private final SmartDevice smartDevice;

    public SmartDeviceAdapter(SmartDevice smartDevice) {
        this.smartDevice = smartDevice;
    }

    @Override
    public void powerOn() {
        smartDevice.turnOn();
    }

    @Override
    public void powerOff() {
        smartDevice.turnOff();
    }
}
