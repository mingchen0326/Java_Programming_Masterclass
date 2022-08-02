public class EvenDigitSum {
    public static int getEvenDigitSum (int number) {
        int sum = 0;
        int digit = 0;
        if (number >= 0) {
            while (number > 0) {
                digit = number % 10;
                number /= 10;
                if (digit % 2 == 0) {
                    sum += digit;
                }
            }
            return sum;
        }
        return -1;
    }
}
