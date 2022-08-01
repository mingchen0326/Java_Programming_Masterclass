public class Main {
    public static void main(String[] args) {
        // ----------------------------------------------Video 63. The Switch Statement-------------------------------------------
//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

//        int switchValue = 1;
//
//        switch (switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//
//            case 2:
//                System.out.println("Value was 2");
//                break;
//
//            case 3: case 4: case 5:
//                System.out.println("was a 3, or a 4, or a 5");
//                break;
//
//            default:
//                System.out.println("Was not 1 or 2");
//                break;
//        }
//
//        char letter = 'A';
//
//        switch (letter) {
//            case 'A':
//                System.out.println("A was found");
//                break;
//            case 'B':
//                System.out.println("B was found");
//                break;
//            case 'C':
//                System.out.println("C was found");
//                break;
//            case 'D':
//                System.out.println("D was found");
//                break;
//            case 'E':
//                System.out.println("E was found");
//                break;
//            default:
//                System.out.println("letter not found");
//                break;
//        }


        // ----------------------------------------------Video 65. The for Statement-------------------------------------------
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2));
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 3));

//        for (int i=1; i<5; i++) {
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
//        }
//
//        for (int i=8; i>2; i--) {
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
//        }

//        int count = 0;
//        int n = 20;
//        for (int i=3; i <= n; i++) {
//            if (isPrime(i)) {
//                count++;
//                System.out.println(i + " is prime number");
//            }
//        }
//        System.out.println("number " + n + " has " + count + " prime numbers" );

        int count = 0;
        while (count != 5) {
            System.out.printf("Count value is %d\n", count);
            count++;
        }

        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        boolean isEven = isEvenNumber(4);
        System.out.println("is Even is " + isEven);
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i=2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isEvenNumber (int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
}