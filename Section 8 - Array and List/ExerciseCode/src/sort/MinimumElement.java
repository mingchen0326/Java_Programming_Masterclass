package sort;

import java.util.Scanner;

public class MinimumElement {
    private static Scanner scanner = new Scanner(System.in);
    private static int readInteger() {

        System.out.println("Please enter the number of integer to enter: ");
        int count = scanner.nextInt();

        return count;
    }

    private static int[] readElements(int count) {
        int[] array = new int[count];
        int index = 0;
        while (index < array.length) {
            array[index] = scanner.nextInt();
            scanner.nextLine();
            index++;
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i=0; i<array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

}
