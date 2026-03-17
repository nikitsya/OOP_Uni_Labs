package t11_design_patterns_2.exercises.ex04;

import java.util.ArrayList;
import java.util.List;

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
    private double _threshold;

    public OverheatAlarmListener(double threshold) {
        _threshold = threshold;
    }

    @Override
    public void onTemperatureChanged(double celsius) {
        if (celsius >= _threshold) {
            System.out.println("ALARM: " + celsius + "C");
        }
    }
}

class TemperatureSensor {

    List<TemperatureListener> listeners = new ArrayList<>();

    void addListener(TemperatureListener l) {
        if (l == null) throw new NullPointerException("TemperatureListener is null");
        listeners.add(l);
    }

    boolean removeListener(TemperatureListener l) {
        if (l == null) throw new NullPointerException("TemperatureListener is null");
        return listeners.remove(l);
    }

    void setTemperature(double celsius) {
        for (TemperatureListener l : listeners) {
            l.onTemperatureChanged(celsius);
        }
    }
}

public class Exercise {
    public static void run() {
        TemperatureSensor sensor = new TemperatureSensor();

        sensor.addListener(listener1);
        sensor.addListener(listener1);
        sensor.addListener(listener2);
    }
}
