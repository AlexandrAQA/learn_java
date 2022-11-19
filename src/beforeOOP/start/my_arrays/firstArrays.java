package beforeOOP.start.my_arrays;

public class firstArrays {
    public static void main(String[] args) {
        //[] we tell our compiler that we are creating new array
        int [] array1 = new int[100]; //we created new empty array with 100 potential items

        System.out.println("length is " + array1.length); //to know the length of the array

        //#1 simply initialisation
        int[] array3 = new int[3];
        array3[0] = 100;
        array3[1] = 22;
        array3[2] = 33;
        System.out.println(array3); //[I@154617c we need cycle for printing array

        //declare + initiate our array
        int[] arr = {1, 22, 0, 100, 4, 99};

        //declare + initiate our array
        int[] array5 = new int[]{1, 0, 22,44,66,87,123,78,35,77,99,1000};

        //just declare array
        int[] array6 = new int[7];

        printArr(array5);



    }

    public static void printArr (int[] arr){
        for (int i= 0; i < arr.length; i++){
            System.out.println("array[" + i + "] = " + arr[i]);

        }

    }
}
