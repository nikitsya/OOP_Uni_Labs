package t11_design_patterns_2.exercises.ex02;

enum Difficulty {EASY, HARD}

interface Enemy {
    String name();

    int hp();

    int damage();
}

class EnemyFactory {
    Enemy createSlime(Difficulty difficulty) {
        return null;
    }
}

public class Exercise {
    public static void run() {
        // TODO
    }
}
