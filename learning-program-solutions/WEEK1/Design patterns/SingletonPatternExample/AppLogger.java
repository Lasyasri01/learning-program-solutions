public class AppLogger {

    // A static reference to hold the single instance
    private static AppLogger instance = null;

    // Some dummy log data for demonstration
    private String latestLog = "Logger initialized.";

    // Private constructor to block direct object creation
    private AppLogger() {
        System.out.println("Logger object created...");
    }

    // Public method to return the same instance every time
    public static AppLogger getLogger() {
        if (instance == null) {
            instance = new AppLogger(); // create once
        }
        return instance;
    }

    // Simulate logging
    public void log(String msg) {
        latestLog = msg;
        System.out.println("[LOG] " + msg);
    }

    // To verify data (to show same instance used)
    public String getLastLog() {
        return latestLog;
    }
}
