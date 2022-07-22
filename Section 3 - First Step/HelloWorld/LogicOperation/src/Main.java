public class Main {
    public static void main(String[] args) {

        // Video 35. if-then statement
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And I am scared of Alien");
        }

        // ---------------------------------------------------------------------------------------------
        // Video 36. Logical and Operator
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!!!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        // ---------------------------------------------------------------------------------------------
        // Video 37. Logical OR Operator
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        // ---------------------------------------------------------------------------------------------
        // Video 38. Assignment Operation VS Equals to Operator
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("This is not suppsed to happen");
        }

        // ---------------------------------------------------------------------------------------------
        // Video 39. Ternary Operator
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("Ternary is true");
        }

        // ---------------------------------------------------------------------------------------------
        // Video 40. Operator Challenge
        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double sumDouble = firstDouble + secondDouble * 100d;
        System.out.println("sumDouble is " + sumDouble);
        double remainder = sumDouble % 40.00d;
        System.out.println("remainder is " + remainder);
        boolean isZero = (remainder == 0) ? true : false;
        System.out.println("isZero = " + isZero);
        if (!isZero) {
            System.out.println("Got some remainder");
        }
    }
}