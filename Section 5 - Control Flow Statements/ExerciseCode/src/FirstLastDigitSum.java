public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        } else {
            int sum = number % 10;
            while (number > 0) {
                if (number < 10) {
                    sum += number;
                    break;
                }
                number /= 10;
            }
            return sum;
        }
    }
}
