public class LoggerTest {
    public static void main(String[] args) {

        // Getting logger instance 1
        AppLogger loggerOne = AppLogger.getLogger();
        loggerOne.log("First log message");

        // Getting logger instance 2
        AppLogger loggerTwo = AppLogger.getLogger();
        loggerTwo.log("Second log message from another reference");

        // Check if both objects are same
        if (loggerOne == loggerTwo) {
            System.out.println("Only one Logger instance exists.");
        } else {
            System.out.println("Different instances found!");
        }

        // Final verification
        System.out.println("Last message recorded: " + loggerOne.getLastLog());
    }
}
