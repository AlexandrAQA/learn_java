package beforeOOP.start.cycles;

public class Recursion {
    public static void main(String[] args) {
        int num = 10;
        int result = factorial(num);

        System.out.println("factorial " + num + " = " + result);

        int resFibo = fib(num);
        System.out.println("Fibonacci " + num + " = " + resFibo);


    }
        //recursion: we ping method inside himself
    public static int factorial(int num){
        if(num > 1){
            return num * factorial(num - 1);
        } else {
            return 1;
        }
    }
    //recursion for Fibonacci numbers
    public static int fib(int num){
        if (num < 2){
            return 1;
        } else {
            return fib(num - 1) + fib(num - 2);
        }
    }

}
