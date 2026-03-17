package t11_design_patterns_2.exercises.ex02;

enum Difficulty {EASY, HARD}

interface Enemy {
    String name();

    int hp();

    int damage();
}

class Slime implements Enemy {

    @Override
    public String name() {
        return "Slime";
    }

    @Override
    public int hp() {
        return 20;
    }

    @Override
    public int damage() {
        return 3;
    }
}

class ArmouredSlime implements Enemy {

    @Override
    public String name() {
        return "ArmouredSlime";
    }

    @Override
    public int hp() {
        return 45;
    }

    @Override
    public int damage() {
        return 6;
    }
}

class EnemyFactory {
    Enemy createSlime(Difficulty difficulty) {
        if (difficulty == Difficulty.EASY) {
            return new Slime();
        } else if (difficulty == Difficulty.HARD) {
            return new ArmouredSlime();
        }
        throw new IllegalArgumentException("Invalid difficulty");
    }
}

public class Exercise {
    public static void run() {
        // TODO
    }
}
