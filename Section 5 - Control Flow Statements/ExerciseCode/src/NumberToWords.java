public class NumberToWords {
    public static int getDigitCount (int number) {
        if (number >= 0) {
            return String.valueOf(number).length();
        }
        return -1;
    }


    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int digit;
            StringBuilder word = new StringBuilder();
            int reversedNumber = reverse(number);
            int numberOfZeros = getDigitCount(number) - String.valueOf(reversedNumber).length();
            while (reversedNumber >= 0) {
                digit = reversedNumber % 10;
                reversedNumber /= 10;
                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                if (reversedNumber == 0) {
                    break;
                }
            }
            while (numberOfZeros > 0) {
                System.out.println("Zero");
                numberOfZeros--;
            }
        }
    }

    public static int reverse (int number) {
        int reversedNumber = 0;
        if (number < 0) {
            number = number * -1;
            while (number > 0) {
                reversedNumber *= 10;
                reversedNumber += number % 10;
                number /= 10;
            }
            return reversedNumber * -1;
        } else {
            while (number > 0) {
                reversedNumber *= 10;
                reversedNumber += number % 10;
                number /= 10;
            }
            return reversedNumber;
        }
    }
}
