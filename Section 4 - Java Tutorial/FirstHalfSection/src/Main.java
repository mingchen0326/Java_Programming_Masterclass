public class Main {

    public static void main(String[] args) {
        // Video 44. Keywords And Expression
        // a mile is equal to 1.609344 kilometers
        double kilometers = (100 * 1.609344);
        int highScore = 50;

        if (highScore == 50) {
            System.out.println("This is an expression");
        }

        // Video 45. Statements, Whitespace and Indentation
        int myVariable = 50;
        myVariable++;

        // Video 46. Code Blocks And the If Then Else statement
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000) {
//            System.out.println("You score was less than 5000");
//        } else if (score < 1000) {
//            System.out.println("You score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        int secondScore = calculateScore(true, 800, 8, 200);

        int highScorePosition = calculateHighScorePosition((100));
        displayHighScorePosition("Frank", highScorePosition);


    }
    // Video 48. Method In Java
    public static int calculateScore(boolean gameOver, int secondScore, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = secondScore + (levelCompleted * bonus);
            System.out.println(("You second final score was " + finalScore));
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//
//        return 4;
        int position = 4; // assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}