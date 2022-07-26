public class Main {
    public static void main(String[] args) {
//        int newScore = calculateScore("Tim", 500);
//        System.out.println("New Score is " + newScore);
//        System.out.println(75);
//        System.out.println();

        double centimeters = FeetAndInchesToCentimeters.calFeedAndInchesToCentimeters(6, 13);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " score " + score + " points" );
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player  score " + score + " points" );
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("no player name, no player score" );
        return 0;
    }
}