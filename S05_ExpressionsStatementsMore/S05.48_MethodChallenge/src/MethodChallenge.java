public class MethodChallenge {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Jim", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Fin", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Slim", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get in to position "
                + highScorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
            return 1;
        } else if (playerScore >= 500) {
            position = 2;
            return 2;
        } else if (playerScore >= 100) {
            position = 3;
            return 3;
        }
        return position;
    }
}