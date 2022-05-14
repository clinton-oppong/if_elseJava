
public class Main {
    public static void main(String[] args) {
        boolean GameOver = true;
        int Score = 900;
        int LevelCompleted = 5;
        int bonus = 100;

        if (Score < 500 && Score > 100) {
            System.out.println("your is between these two conditions");
        } else if (Score < 1000) {
            System.out.println("your score was less\n");

        } else {
            System.out.println("its cool right");
        }

        if (GameOver) {
            int finalScore = Score + (LevelCompleted * bonus);
            System.out.println("the final game score is : " + finalScore);
        }
    }
}