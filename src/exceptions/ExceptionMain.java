package exceptions;

public class ExceptionMain {
    public static void main(String[] args) {

        int v1 = 10;
        int v2 = 0;
        int res = 0;
        System.out.printf(" first number = %d divide by second number = %d is equal: \n", v1, v2);
        try {
            res = v1/v2;
        } catch (ArithmeticException | OutOfMemoryError exc){
            System.out.println(exc);
            System.out.println("we can't divide by zero :-(");
        }


        Employee[] employee = new Employee[]{
                new Employee(), new Employee()
        };

        for (int i = 0; i <= employee.length; i++) {
            try {
                Employee employee1 = employee[i];

            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println(exception);
            }
            System.out.println("The code is running");

        }

        System.out.println("Tne end");

    }
}
