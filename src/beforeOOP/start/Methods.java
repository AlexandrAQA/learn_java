package beforeOOP.start;

public class Methods {
    public static void main(String[] args) {

        System.out.println(compare((int) 345.4));

    }


      public static String compare (int a){
        String result = null;
        if ( a < 10){
            result = "a < 10";
        }if (a == 10){
            result = "a = 10";
        }if (a > 10){
            result = "a > 10";
        } else {
            System.out.println("Please Enter correct Integer");
        }

        return result;
    }




}
