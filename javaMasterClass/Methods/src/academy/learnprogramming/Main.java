package academy.learnprogramming;

public class Main {

    public static void main(String[] args) { // this is the main method
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Your final score was " + highScore);

        // CHALLENGE BELOW
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

//        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Your final score was " + highScore);

        score = calculateHighScorePosition(1000);
        displayHighScorePosition("Dave", score);
        score = calculateHighScorePosition(900);
        displayHighScorePosition("Jack", score);
        score = calculateHighScorePosition(400);
        displayHighScorePosition("Fred", score);
        score = calculateHighScorePosition(50);
        displayHighScorePosition("Tim", score);

    }

    // CHALLENGE
    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table.");

    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

    // this is the calculateScore method
//    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 2000;
//            return finalScore;
//        }
//        return -1;
//    }
}
