package t11_design_patterns_2.exercises.ex05;

interface Logger {
    void log(String msg);
}

class LegacyLogger {
    void logMessage(String msg) {

    }
}

class LegacyLoggerAdapter implements Logger {
    LegacyLoggerAdapter(LegacyLogger legacy) {

    }

    void log(String msg) {

    }
}

public class Exercise {
    public static void run() {
        // TODO
    }
}
