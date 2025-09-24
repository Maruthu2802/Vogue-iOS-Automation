package com.automate.driver.Manager;

public final class DeviceManager {

    private static ThreadLocal<String> deviceName = new ThreadLocal<>();

    public static String getDeviceName() {
        return deviceName.get();
    }

    public static void setDeviceName(String name) {
        deviceName.set(name);
    }

    public static void unload() {
        deviceName.remove();
    }
}
