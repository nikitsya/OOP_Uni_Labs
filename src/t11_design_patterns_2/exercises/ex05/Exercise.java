package t11_design_patterns_2.exercises.ex05;

interface Logger {
    void log(String msg);
}

class LegacyLogger {
    void logMessage(String msg) {
        System.out.println("LEGACY: " + msg);
    }
}

class LegacyLoggerAdapter implements Logger {

    LegacyLogger _legacy = new LegacyLogger();

    LegacyLoggerAdapter(LegacyLogger legacy) {
        if (legacy == null) throw new IllegalArgumentException("legacy is null.");
        _legacy = legacy;
    }

    @Override
    public void log(String msg) {
        _legacy.logMessage(msg);
    }
}

public class Exercise {
    public static void run() {
        LegacyLoggerAdapter legacy = new LegacyLoggerAdapter(new LegacyLogger());
        legacy.log("Hello World!");
    }
}
