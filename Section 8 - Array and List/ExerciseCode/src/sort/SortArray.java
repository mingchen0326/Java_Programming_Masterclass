package sort;

import java.util.Scanner;

public class SortArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = getIntegers();
        int[] sortedArray = sortedArray(array);
        printArray(sortedArray);
        int[] sortedArray2 = sortedArray(array);
        printArray(sortedArray2);
    }

    public static int[] getIntegers() {
        System.out.println("Please enter the number of digit to sort");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i=0; i<length; i++) {
            System.out.println("Please enter element #" + i);
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " is " + array[i]);
        }
    }

    public static int[] sortedArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int j=0; j<newArray.length; j++) {
            int[] copyArray = array;
            int max = copyArray[0];
            for (int i=0; i<copyArray.length; i++) {
                if (copyArray[i] > max) {
                    max = copyArray[i];
                }
            }
            newArray[j] = max;
            int counter = 0;
            int[] emptyArray = new int[array.length-1];
            array = emptyArray;
            for (int k=0; k<copyArray.length;k++) {
                if (copyArray[k] != max) {
                    array[counter] = copyArray[k];
                    counter++;
                }
            }
        }

        return newArray;
    }

    public static int[] sortedArray2(int[] array) {
        int[] sortedArray = new int[array.length];
        sortedArray = array;
        int elementHolder;
        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i=0; i<sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    elementHolder = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = elementHolder;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
