package beforeOOP.start.my_arrays;

public class twoThreeDemArrays {
    public static void main(String[] args) {
        int[][] array = new int[5][];
        array[0] = new int[]{1};
        array[1] = new int[]{20, 23};
        array[2] = new int[]{3, 33, 3230};
        array[3] = new int[]{4, 44, 444, 4444};
        array[4] = new int[]{5, 55, 555, 5555, 55555};

        printTwoArray(array);

        boolean[][][] freeParkingSlot = new boolean[3][2][5];
        freeParkingSlot[1][1][4] = true;
        freeParkingSlot[2][1][3] = true;
        freeParkingSlot[2][1][2] = true;

        printThreeArray(freeParkingSlot);


    }

    public static void printTwoArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {   //strings
            for (int j = 0; j < arr[i].length; j++) {  //columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printThreeArray(boolean[][][] arr) {
        for (int i = 0; i < arr.length; i++) {   //strings
            for (int j = 0; j < arr[i].length; j++) {  //columns
                for (int k = 0; k < arr[i][j].length; k++) {  //columns
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }


    }
}