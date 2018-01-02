package in.swapnilsingh;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.calculateScore(true, 800, 5, 100);

        main.calculateScore(true, 10000, 8, 200);

        int score = main.calculateHighScorePosition(1500);
        System.out.println(score);
        score = main.calculateHighScorePosition(900);
        System.out.println(score);
        score = main.calculateHighScorePosition(400);
        System.out.println(score);
        score = main.calculateHighScorePosition(50);
        System.out.println(score);

        main.displayHighScorePosition("Swapnil Singh", 1);
    }

    private void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }

    private int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        }
        return 4;
    }

    private void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score + (bonus * levelCompleted);
        finalScore += 1000;
        if (gameOver)
            System.out.println("Your final score is: " + finalScore);
    }
}