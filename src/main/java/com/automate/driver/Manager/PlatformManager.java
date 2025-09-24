package com.automate.driver.Manager;

public final class PlatformManager {

    private static ThreadLocal<String> platformName = new ThreadLocal<>();

    public static String getPlatformName() {
        return platformName.get();
    }

    public static void setPlatformName(String name) {
        platformName.set(name);
    }

    public static void unload() {
        platformName.remove();
    }
}
