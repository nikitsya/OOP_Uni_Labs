package t11_design_patterns_2.exercises.ex03;

import java.util.ArrayList;
import java.util.List;

interface ClickListener {
    void onClick();
}

class Button {

    List<ClickListener> listeners = new ArrayList<>();

    void addListener(ClickListener l) {
        if (l == null) throw new NullPointerException();
        listeners.add(l);
    }

    boolean removeListener(ClickListener l) {
        if (l == null) throw new NullPointerException();
        return listeners.remove(l);
    }

    void click() {
        for (ClickListener l : listeners) {
            l.onClick();
        }
    }
}

class SoundListener implements ClickListener {
    @Override
    public void onClick() {
        System.out.println("SFX: click");
    }
}

class AnalyticsListener implements ClickListener {
    @Override
    public void onClick() {
        System.out.println("ANALYTICS: click");
    }
}


public class Exercise {
    public static void run() {
        // TODO
    }
}
