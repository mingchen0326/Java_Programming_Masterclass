public class SharedDigit {
    public static boolean hasSharedDigit (int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        } else {
            int digit1 = 0;
            int digit2 = 0;
            int num1Copy = num1;
            boolean common = false;
            while (num1Copy > 0) {
                int num2Copy = num2;
                digit1 = num1Copy % 10;
                num1Copy /= 10;

                while (num2Copy > 0) {
                    digit2 = num2Copy % 10;
                    num2Copy /= 10;
                    if (digit1 == digit2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
