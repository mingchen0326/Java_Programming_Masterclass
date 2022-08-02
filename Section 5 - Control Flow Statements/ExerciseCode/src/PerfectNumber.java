public class PerfectNumber {
    public static boolean isPerfectNumber (int number) {
        int sum = 0;
        int divisor = 1;
        if (number >= 1) {
            while (divisor < number) {
                if (number % divisor == 0) {
                    sum += divisor;
                }
                divisor++;
            }
            return sum == number;
        }
        return false;
    }
}
