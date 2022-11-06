package cycles;

public class Fibo {
    public static void main(String[] args) {
        //1,1,2,3, 5, 8, 13, 21, 34, 55, 89
        int fo = 1;
        int f1 = 1;
        int result;
        System.out.print(fo + " " + f1 + " ");

        for (int i = 3; i <= 11; i++) {
             result = fo + f1;
            System.out.print(result + " ");

            fo = f1;
            f1 = result;
        }

    }
}