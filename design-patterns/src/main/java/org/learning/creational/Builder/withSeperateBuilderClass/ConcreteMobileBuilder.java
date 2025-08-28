package org.learning.creational.Builder.withSeperateBuilderClass;

public class ConcreteMobileBuilder extends MobileBuilder{
    @Override
    public void createMemory() {
        getMobile().setMemory("32 GB");
        System.out.println("Memory created and installed");
    }

    @Override
    public void createBattery() {
        getMobile().setBattery("5000 mAh");
        System.out.println("Battery created and installed");
    }

    @Override
    public void createWireless() {
        getMobile().setWireless("Bluetooth and WiFi");
        System.out.println("Wireless created and installed");
    }

    @Override
    public void createScreen() {
        getMobile().setScreen("Amoled");
        System.out.println("Screen created and installed");
    }

    @Override
    public void createMetalCase() {
        getMobile().setMetalCase("Aluminum");
        System.out.println("Metal case created and installed");
    }
}
