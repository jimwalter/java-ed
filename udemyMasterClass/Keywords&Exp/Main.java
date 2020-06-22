import javax.swing.text.GapContent;

public class Main {
    public static void main(String[] args) {
        int score = 5000;
        int bonus = 100;
        boolean gameover = true;
        int levelCompleted = 5;

        // if (score <= 4000) {
        //     System.out.println("Your score was less than 5000");

        // } else if (score > 4500 && score < 6700) {
        //     System.out.println("Score greater than 4500");
        // } else {
        //     System.out.println("got to end");
        // }

        if (gameover) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("You final score was : " + finalScore);
        }
    }
}