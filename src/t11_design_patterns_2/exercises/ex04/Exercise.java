package t11_design_patterns_2.exercises.ex04;

interface TemperatureListener {
    void onTemperatureChanged(double celsius);
}

class ConsoleDisplayListener implements TemperatureListener {
    @Override
    public void onTemperatureChanged(double celsius) {
        System.out.println("TEMP: " + celsius + "C");
    }
}

class OverheatAlarmListener implements TemperatureListener {
    @Override
    public void onTemperatureChanged(double celsius) {
        System.out.println("ALARM: " + celsius + "C");
    }
}

class TemperatureSensor {
    void addListener(TemperatureListener l) {

    }

    boolean removeListener(TemperatureListener l) {
        return false;
    }

    void setTemperature(double celsius) {

    }
}

public class Exercise {
    public static void run() {
        // TODO
    }
}
