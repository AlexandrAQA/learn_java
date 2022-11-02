package my_arrays;

public class stringArray {
    public static void main(String[] args) {
        String[] arr = new String[]{"Hello", "Hi", "Buy", "etc"};
        String[] arr1 = new String[3];
        arr1[0] = "A";
        arr1[1] = "B";
        arr1[2] = "C";
        printArrForEach(arr1);
        printArray(arr);

    }

    //FOR_EACH cycle
    public static void printArrForEach(String[] arr) {
        for (String str : arr) {

            System.out.println("str= " + str);
            if (str == "C") {
                System.out.println("For each cycle is done.");
            }


        }

    }


    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("array[" + i + "] = " + arr[i]);

        }

    }

    //overload methods with another type of params or another params' count
    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("array[" + i + "] = " + arr[i]);

        }

    }
}
