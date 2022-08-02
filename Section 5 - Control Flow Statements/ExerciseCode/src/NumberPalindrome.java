public class NumberPalindrome {
    public static boolean isPalindrome (int number) {
        if (number < 0) {
            number *= -1;
        }

        int numberCopy = number;

        int reverse = 0;
        while (numberCopy > 0) {
            reverse *= 10;
            reverse += (numberCopy % 10);
            numberCopy /= 10;
        }
        if (reverse == number) {
            return true;
        } else return false;
    }
}
