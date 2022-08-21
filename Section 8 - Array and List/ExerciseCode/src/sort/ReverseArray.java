package sort;

import java.util.Arrays;
public class ReverseArray {

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5};
        System.out.println("Array = " + Arrays.toString(array));
        printArray(array);
        reverse(array);
        System.out.println("Array = " + Arrays.toString(array));
        printArray(array);
    }

    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int reversedIndex = array.length-1;
        int temp;
        for (int i=0; i<array.length/2; i++) {
            temp = array[i];
            array[i] = array[reversedIndex];
            array[reversedIndex] = temp;
            reversedIndex--;
        }
        System.out.println("Array = " + Arrays.toString(array));
    }

    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
