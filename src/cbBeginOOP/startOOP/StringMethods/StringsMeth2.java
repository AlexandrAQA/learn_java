package cbBeginOOP.startOOP.StringMethods;

public class StringsMeth2 {
    public static void main(String[] args) {
        String text = "Second string";
        System.out.println(text.charAt(5)); //5th char from this string

        //from String to Char Array:
        char[] chArr = text.toCharArray();
        chArr[0] = '$';
        System.out.println(chArr);
        System.out.println();

        //from char array to string:
        String newText = new String(chArr);
        System.out.println(newText);

        //find a symbol in a String
        System.out.println(text.indexOf("ond"));
        System.out.println(text.lastIndexOf("n"));

        //replace a symbol in the string
        String text2 = "The second string with sss";
        System.out.println(text2.replace("s", "$"));

        //delete spaces in the start and end
        String text3 = "     The second     string               ";
        System.out.println(text3.trim());

        // UPPER CASE & lower case
        System.out.println(text2.toUpperCase());
        System.out.println(text2.toLowerCase());
        System.out.println();

        // string to Array of Words
        String text4 = "The;second;string;with;some;dummy;text;for;some;test;";
        String[] os = text4.split(";");
        for (String el : os){
            System.out.println(el);
        }

    }
}
