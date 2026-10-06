import java.util.Scanner;

class Device {
    int deviceID;
    String deviceName;
    boolean powerStatus;

    Device(int id, String name) {
        deviceID = id;
        deviceName = name;
        powerStatus = false;
    }

    void turnOn() {
        powerStatus = true;
        System.out.println(deviceName + " is turned ON.");
    }

    void turnOff() {
        powerStatus = false;
        System.out.println(deviceName + " is turned OFF.");
    }

    void displayInfo() {
        System.out.println("Device ID: " + deviceID);
        System.out.println("Device Name: " + deviceName);
        System.out.println("Power Status: " + (powerStatus ? "ON" : "OFF"));
    }
}

class SmartLight extends Device {
    int brightnessLevel;
    String colorMode;

    SmartLight(int id, String name, int brightness, String color) {
        super(id, name);
        brightnessLevel = brightness;
        colorMode = color;
    }

    void changeBrightness(int level) {
        brightnessLevel = level;
        System.out.println("Brightness set to " + brightnessLevel + "%");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Brightness Level: " + brightnessLevel + "%");
        System.out.println("Color Mode: " + colorMode);
    }
}

public class SmartHome {

    public static void main(String[] args) {
        SmartLight light = new SmartLight(101, "Living Room Light", 50, "Warm White");

        System.out.println("--- SmartLight Status ---");
        light.displayInfo();

        System.out.println();
        light.turnOn();
        light.changeBrightness(80);
        light.displayInfo();

        System.out.println();
        light.turnOff();
    }
}