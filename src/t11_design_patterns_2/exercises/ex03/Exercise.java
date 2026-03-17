package t11_design_patterns_2.exercises.ex03;

import java.util.ArrayList;
import java.util.List;

interface ClickListener {
    void onClick();
}

class Button {

    List<ClickListener> listeners = new ArrayList<>();

    void addListener(ClickListener l) {

    }

    boolean removeListener(ClickListener l) {
        return false;
    }

    void click() {

    }
}

public class Exercise {
    public static void run() {
        // TODO
    }
}
