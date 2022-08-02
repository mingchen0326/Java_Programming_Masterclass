public class LargestPrime {
    public static int getLargestPrime (int number) {
        if (number > 1) {
            for (int divisor = number; divisor > 1; divisor--) {
                if (number % divisor == 0 && divisor != number && divisor != 1) {
                    boolean isPrime = true;
                    int num = divisor;
                    while (num > 1) {
                        if (divisor % num == 0 && num < divisor && num != 1) {
                            isPrime = false;
                        }
                        num--;
                    }
                    if (isPrime) {
                        return divisor;
                    }
                }
            }
            return number;
        }
        return -1;
    }
}
