package beforeOOP.start.sorting;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = new int[]{55,44,77,88,99,1,0,5,10,33,11,15,8,22,9,3,100};
        myBubbleSort(arr);

    }

    public static void myBubbleSort(int[]array){
        for (int i=0; i < array.length; i ++){
            for (int j = 1; j < array.length-i; j++){
                if(array[j-1]>array[j]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
            System.out.println("==============================");
        }

    }
}
