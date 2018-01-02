package in.swapnilsingh;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Swapnil", 5000);
        System.out.println("New score is: " + newScore);
        double centimeters = 0d;
        centimeters = calcFeetAndInchesToCentimeters(6, 0);
        System.out.println(centimeters + "cm");
        centimeters = calcFeetAndInchesToCentimeters(157);
        System.out.println(centimeters + "cm");
    }

    private static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    private static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score);
        return score * 1000;
    }

    private static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    private static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            return (feet * 30.48) + inches * 2.54;
        } else {
            return -1;
        }
    }

    private static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            int feet = (int) (inches / 12);
            double newInches = inches % 12;
            System.out.println(feet + " feet & " + newInches + " inches.");
            return calcFeetAndInchesToCentimeters(feet, newInches);
        } else {
            return -1;
        }
    }

}
