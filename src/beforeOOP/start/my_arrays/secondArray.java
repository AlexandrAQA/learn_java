package beforeOOP.start.my_arrays;

import java.util.Scanner;

public class secondArray {
    public static void main(String[] args) {
        int[] array = new int[3];
        //int[] arr = new int[]{12, 33,44,55};
       fillArray(array);
       printArray(array);

    }

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

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("array[" + i + "] = " + arr[i]);

        }

    }
}
