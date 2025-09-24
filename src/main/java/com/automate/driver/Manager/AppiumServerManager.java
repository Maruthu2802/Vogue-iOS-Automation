package com.automate.driver.Manager;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public final class AppiumServerManager {

    private static ThreadLocal<Process> process = new ThreadLocal<>();


    
 // Auto-detect Appium executable
 private static final String APPIUM_PATH =
    System.getenv("APPIUM_PATH") != null ? System.getenv("APPIUM_PATH")
    : (isWindows()
        ? "C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\npm\\appium.cmd"
        : (new java.io.File("/opt/homebrew/bin/appium").exists()
            ? "/opt/homebrew/bin/appium"
            : (new java.io.File("/usr/local/bin/appium").exists()
                ? "/usr/local/bin/appium"
                : "/Users/" + System.getProperty("user.name") + "/.npm-global/bin/appium")));

    // Auto-detect Android SDK path
    private static final String ANDROID_SDK_PATH =
            System.getenv("ANDROID_HOME") != null ? System.getenv("ANDROID_HOME")
            : (System.getenv("ANDROID_SDK_ROOT") != null ? System.getenv("ANDROID_SDK_ROOT")
            : (isWindows()
                ? "C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Local\\Android\\Sdk"
                : System.getProperty("user.home") + "/Library/Android/sdk")); // default Mac

    // Utility to detect OS
    private static boolean isWindows() {
        return System.getProperty("os.name").toLowerCase().contains("win");
    }





    private AppiumServerManager() {}

    public static void startServer(int port) {
    	try {
            // Start building the command with basic Appium arguments
            String cmd = String.format("%s --port %d --base-path /wd/hub", APPIUM_PATH, port);
     
            // Check if the session.override system property is set (either from TestNG XML or environment)
            String sessionOverride = System.getProperty("session.override"); // Look for system property
     
            // If session.override is set to "true", add --session-override flag
            if ("true".equalsIgnoreCase(sessionOverride)) {
                cmd += " --session-override";
            }
     
            // Create a new process builder with the constructed command
            ProcessBuilder pb = new ProcessBuilder(cmd.split(" "));
            pb.inheritIO();  // Inherit IO from the parent process (console output)
     
            // Set environment variables (including SDK paths)
            pb.environment().put("ANDROID_HOME", ANDROID_SDK_PATH);
            pb.environment().put("ANDROID_SDK_ROOT", ANDROID_SDK_PATH);
     
            // Add Appium path to the system PATH for the server process
            String path = System.getenv("PATH");
            pb.environment().put("PATH", path + ":" + APPIUM_PATH.substring(0, APPIUM_PATH.lastIndexOf("/")));
     
            // Start the Appium server process
            Process p = pb.start();
            process.set(p);
            System.out.println("✅ Starting Appium server on port " + port);
     
            // Wait for the server to come up
            waitForServer(port);
            System.out.println("✅ Appium server started successfully");
     
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("❌ Failed to start Appium server", e);
        }
    }

    private static void waitForServer(int port) throws InterruptedException {
        int retries = 0;
        boolean serverUp = false;

        while (retries < 15) { // Retry max 15 times
            try {
                HttpURLConnection conn = (HttpURLConnection) new URL("http://127.0.0.1:" + port + "/wd/hub/status").openConnection();
                conn.setConnectTimeout(2000);
                conn.connect();
                if (conn.getResponseCode() == 200) {
                    serverUp = true;
                    break;
                }
            } catch (Exception ignored) {}
            Thread.sleep(1000);
            retries++;
        }

        if (!serverUp) throw new RuntimeException("❌ Appium server did not start in time");
    }

    public static void stopServer() {
        try {
            if (process.get() != null) {
                Process p = process.get();
                p.destroy();
                if (!p.waitFor(5, TimeUnit.SECONDS)) {
                    p.destroyForcibly();
                    System.out.println("⚠ Appium server forcibly killed");
                } else {
                    System.out.println("✅ Appium server stopped gracefully");
                }
                process.remove();
            }
        } catch (Exception e) {
            System.err.println("⚠ Error stopping Appium server: " + e.getMessage());
        }
    }
}
