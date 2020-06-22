public class Main {

    //main is a method
    public static void main(String[] args) {
        
        // invoke calculate score method
        calculateScore(true, 5000, 5, 100);
    }

    // new method for calculating score
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("You final score was : " + finalScore);
        }
    }

}