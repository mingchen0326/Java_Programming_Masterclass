public class LastDigitChecker {
    public static boolean hasSameLastDigit (int num1, int num2, int num3) {
        if (isValid(num1) && isValid(num2) && isValid(num3 )) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;
            int digit3 = num3 % 10;

            return (digit1 == digit2) || (digit1 == digit3) || (digit2 == digit3);
        }
        return false;
    }

    public static boolean isValid (int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        }
        return false;
    }
}
