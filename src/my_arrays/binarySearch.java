package my_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        //#0 create new array
        int[] array = new int[5];
        //#1 fill Array from console (not sorted)
        fillArray(array);
        //#2 sort array
        Arrays.sort(array);
        //#3 print sorted array
        printArr(array);
        //#4 we need Number which we are going to find
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for searching in array: ");
        int elem = scanner.nextInt();
        //#5 binary search
        myBinarySearch(array, elem);


    }
    //binary search algorithm
    public static void myBinarySearch(int[] arr, int element) {
        int firstIndex = 0;
        int theFinalIndex = arr.length - 1;
        int result = -1;

        while (firstIndex <= theFinalIndex) {
            int middleIndex = (firstIndex + theFinalIndex) / 2;
            if (arr[middleIndex] == element) {
                result = middleIndex;
                break;

            } else if (arr[middleIndex] < element) {
                firstIndex = middleIndex + 1;

            } else if (arr[middleIndex] < element) {
                firstIndex = middleIndex + 1;
            }


        }
        System.out.println("Your number is found: array[" + result + "] = " + element);

    }
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("array[" + i + "] = " + arr[i]);

        }
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


}

