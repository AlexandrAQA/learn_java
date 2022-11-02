package a_smt.start;

public class Math_ {
    public static void main(String[] args) {
        //Math operators
        System.out.println(Math.abs(-2)); //module of the value
        System.out.println(Math.pow(2.0,3.2)); //возведение в степень (double)
        System.out.println(Math.pow(2.0,8)); //возведение в степень (double)
        System.out.println(Math.sqrt(256.0)); //корень числа (double)
        int ra = (int)(Math.random() * 10 + 1); //simple random value from 0 to 10
        System.out.println("random value = " + ra); //random numbers
        System.out.println("=====================================================");

        //how to print random numbers from 1 to 10
        // 1.define the range
        int max = 10;
        int min = 1;
        int range = max;

        // 2. generate random numbers within 1 to 10
        for (int i = 0; i < 10; i++) {
            int rand = (int)(Math.random() * range) + min;

            // 3.Output is different everytime this code is executed
            System.out.println(rand);


    }
}}
