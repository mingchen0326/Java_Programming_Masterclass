public class SumDigits {
    public static int sumDigits (int number) {
//        int sum = 0;
//        int length = String.valueOf(number).length();
//        int divider = 1;
//        if (number < 10) {
//            return -1;
//        } else {
//            while (length > 1) {
//                divider *= 10;
//                length--;
//            }
//            while (divider >= 1) {
//                sum = sum + (number / divider);
//                number = number % divider;
//                divider /= 10;
//            }
//            return sum;
//        }
        int sum = 0;
        if (number < 10) {
            return -1;
        }

        while (number > 0) {
            int digit = number % 10;
            sum += digit;

            // drop least significant digit
            number /= 10;
        }
        return sum;
    }
}
