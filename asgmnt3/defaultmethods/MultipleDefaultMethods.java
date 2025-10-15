package asgmnt3.defaultmethods;

interface Logger {
    default void logInfo(String msg) {
        System.out.println("INFO: " + msg);
    }

    default void logError(String msg) {
        System.err.println("ERROR: " + msg);
    }
}

class AppLogger implements Logger {}

public class MultipleDefaultMethods {
    public static void main(String[] args) {
        AppLogger logger = new AppLogger();
        logger.logInfo("Application started");
        logger.logError("Something went wrong");
    }
}
