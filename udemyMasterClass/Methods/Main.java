public class Main {

    //main is a method
    public static void main(String[] args) {

        // invoke calculate score method
        // calculateScore(true, 5000, 5, 100);

        // boolean gameOver = true;
        // int score = 10000;
        // int highScore = calculateScore(gameOver, score, 8, 200);
        // System.out.println("You final score was : " + highScore);
        
        int jackPosition = calcHighScorePosition(1500);
        displayHighScorePosition("jack", jackPosition);
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
    // if you want to re turn something from the method, use the data type

    // altered calculateScore method to return values
    // default for nothing to return is '-1˛'
        
    // LESSON CHALLENGE
    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + "!");
    }

    public static int calcHighScorePosition(int score) {
        int result = -1;

        if (score >= 1000) {
            result = 1;
        } else if (score >= 500) {
            result = 2;
        } else if (score >= 100) {
            result = 3;
        } else {
            result = 4;
        }

        return result;
    }
}