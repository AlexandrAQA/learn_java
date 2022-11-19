package beforeOOP.start.my_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysMethods {
    public static void main(String[] args) {
        int[] arr = new int[3];
        fillArray(arr);

        //toString prints array, so we don't need to use 'FOR'
        System.out.println("original Array is "
                + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Sorted Array is " + Arrays.toString(arr));

        System.out.println("Enter the desired number from array: ");
        Scanner scanner = new Scanner(System.in);
        int item = scanner.nextInt();

        System.out.println("Your desired number has the following index: ");

        //binary search fast searching:
        System.out.println(Arrays.binarySearch(arr, item));

        //copy array:
        int[] arrCopy = new int[10];
        System.arraycopy(arr, 0, arrCopy, 0, 3);
        System.out.println("New copied array is: ");
        System.out.println(Arrays.toString(arrCopy));
    }

    //fill array with entered from console numbers
    public static void fillArray(int[] arr) {
        System.out.println("Enter some numbers please: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            if (scanner.hasNextInt()) {
                arr[i] = scanner.nextInt();
            } else {
                System.out.println("Please enter only numbers!");
            }

        }

    }
}
