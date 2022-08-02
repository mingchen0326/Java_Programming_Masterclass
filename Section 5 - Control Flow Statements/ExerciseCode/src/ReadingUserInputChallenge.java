import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        getUserInput();
    }
    public static void getUserInput () {
        Scanner scanner = new Scanner (System.in);
        int count = 1;
        int number;

        while (count <= 10) {
            System.out.println("Please enter number #" + count);
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                number = scanner.nextInt();
                System.out.println("Number #" + count + " is " + number);
                count++;
            } else {
                System.out.println("Invalid Number");
            }
            String line = scanner.nextLine(); // handle end of line (enter key)
        }

        scanner.close();
    }
}
