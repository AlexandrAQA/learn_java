package BeginOOP.StartOOP.StringMethods;

public class StringsMeth3 {
    public static void main(String[] args) {
        String str = "some test string";
        String emptyStr = "";
        String emptyStr2 = "          ";
        System.out.println(str.isEmpty());
        System.out.println(emptyStr.isEmpty());
        System.out.println(emptyStr2.isEmpty());

        System.out.println();

        //create a sub string
        String subStr = str.substring(5, 9);
        System.out.println(subStr);

        System.out.println();

        //equals
        String str2 = "some TEST string";
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));

        //compare to
        System.out.println("str compare to str2: " + str.compareToIgnoreCase(str2));
        //starts with
        System.out.println("str starts with str2: " + str.startsWith(str2));
        //ends with
        System.out.println("str ends with str2: " + str.endsWith(str2));
        //contains
        System.out.println("str contains str2: " + str.contains("some"));
        String str3 = "some test string";
        System.out.println(str == str3); //true cause urls are the same (same strings stored at 1 memory place)
    }
}
