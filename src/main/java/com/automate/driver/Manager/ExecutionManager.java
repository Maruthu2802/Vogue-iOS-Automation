package com.automate.driver.Manager;


public class ExecutionManager {
    private static final ThreadLocal<String> executionType = new ThreadLocal<>();

    public static void setExecutionType(String type) {
        executionType.set(type);
    }

    public static String getExecutionType() {
        return executionType.get();
    }

    public static void unload() {
        executionType.remove();
    }
}
