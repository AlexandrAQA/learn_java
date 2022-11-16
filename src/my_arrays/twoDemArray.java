package my_arrays;

public class twoDemArray {
    public static void main(String[] args) {
        int[][] twoArray = new int[2][2];
        float[][][] twoArrayF = new float[3][3][3];
        String[][][][] Arr4 = new String[4][4][4][4];

        //initialize the array
        int[][] arr2 = new int[][]{{1,2},{3,4}};
        int[][] arr3 = new int[][]{{1,2},{3,4}, {5,6},{7,8}, {9,10},{11,12}};


        twoArray[0][0] = 10;
        twoArray[0][1] = 20;
        twoArray[1][0] = 30;
        twoArray[1][1] = 40;
        System.out.println(twoArray.length);
        System.out.println(twoArray[1].length);

        System.out.println("twoArray:");
        printTwoArray(twoArray);
        System.out.println("arr3:");
        printTwoArray(arr3);

        }

        public static void printTwoArray (int[][] arr){
        for (int i =0; i< arr.length; i++){   //strings
            for (int j = 0; j < arr[i].length; j++){  //columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        }



    }

