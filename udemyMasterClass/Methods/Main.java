public class Main {

    //main is a method
    public static void main(String[] args) {
        // invoke calculate score method
        calculateScore();
    }
    // new method for calculating score
    public static void calculateScore() {
        int score = 5000;
        int bonus = 100;
        boolean gameover = true;
        int levelCompleted = 5;

        if (gameover) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("You final score was : " + finalScore);
        }
    }

}