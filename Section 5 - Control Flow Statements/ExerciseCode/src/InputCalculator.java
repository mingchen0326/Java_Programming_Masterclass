import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage () {
        int sum = 0;
        long avg = 0;
        int count = 0;

        Scanner input = new Scanner(System.in);


        while (true) {
            boolean isInt = input.hasNextInt();
            if (isInt) {
                int number = input.nextInt();
                sum += number;
                count++;
                String name = input.nextLine();
            } else {
                avg = Math.round ((double) sum / (double) count);
                System.out.printf("SUM = %d AVG = %d", sum, avg);
                break;
            }
        }
        input.close();
    }
}
