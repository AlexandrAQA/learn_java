package my_arrays;

import java.util.Arrays;

public class ArrayMethodsSecond {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println("default array: " + Arrays.toString(array));

        Arrays.fill(array, 10); //Arrays.fill all array the same value (10)
        System.out.println("New array after filling: " + Arrays.toString(array));

        int[][] arrTwo = new int[5][];
        arrTwo[0] = new int[]{1};
        arrTwo[1] = new int[]{20, 23};
        arrTwo[2] = new int[]{3, 33, 3230};
        arrTwo[3] = new int[]{4, 44, 444, 4444};
        arrTwo[4] = new int[]{5, 55, 555, 5555, 55555};

        //print two_Dem_Array easy:
        System.out.println("Two-Dimensional Array: " + Arrays.deepToString(arrTwo));

        System.out.println("compare two simple arrays: ");
        int[] arr =new int[]{1,2,10};
        int[] arrT = new int[]{1,2,10};
        System.out.println("arr & arrT is equal: " + Arrays.equals(arr, arrT));

        System.out.println("compare two Two-Dimensional Arrays: ");
        int[][] twoArr =new int[][]{{1,11,10},{1,12,110}};
        int[][] twoDimArr = new int[][]{{22,22,2120},{221,2,20}};
        System.out.println("twoArr and twoDimArr is equals: " + Arrays.deepEquals(twoArr, twoDimArr));

        String[] strArr = new String[]{"Luck", "John", "Adam", "Joe", "Zura", "Andrew", "Will", "Bob"};
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
    }
}
