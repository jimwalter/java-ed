public class Main {

    //main is a method
    public static void main(String[] args) {

        // invoke calculate score method
        calculateScore(true, 5000, 5, 100);

        boolean gameOver = true;
        int score = 10000;
        int highScore = calculateScore(gameOver, score, 8, 200);
        System.out.println("You final score was : " + highScore);
    }

    // new method for calculating score
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return -1;
    }


    // VOID keyword is used when the method doesn't have a return
    // if you want to return something from the method, use the data type

    // altered calculateScore method to return values
        // default for nothing to return is '-1˛'
}