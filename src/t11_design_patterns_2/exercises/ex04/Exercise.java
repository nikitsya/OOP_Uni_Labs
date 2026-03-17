package t11_design_patterns_2.exercises.ex04;

interface TemperatureListener {
    void onTemperatureChanged(double celsius);
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
