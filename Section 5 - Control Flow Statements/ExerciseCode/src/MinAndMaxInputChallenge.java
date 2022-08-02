import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        getMinAndMax();
    }

    public static void getMinAndMax () {
        int min = 0;
        int max = 0;
        int count = 1;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Number: ");
            boolean isNumber = scanner.hasNextInt();

            if (isNumber) {
                int number = scanner.nextInt();
                if (count == 1) {
                    min = number;
                    max = number;
                }

                if (number > max) {
                   max = number;
                } else if (number < min) {
                    min = number;
                }
                count++;
                String name = scanner.nextLine();
            } else {
                break;

            }
            scanner.close();
        }

        System.out.println("Min is: " + min);
        System.out.println("Max is: " + max);
    }
}
