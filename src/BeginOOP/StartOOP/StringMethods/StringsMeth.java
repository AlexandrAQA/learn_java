package BeginOOP.StartOOP.StringMethods;

public class StringsMeth {
    public static void main(String[] args) {
        String text = "Some text";
        System.out.println(text.length());

        //Concat Strings:
        String text1 = "...First string";
        String text2 = " Second string";
        text = text1 + " bla bla bla ...";
        System.out.println("text = " + text + "\n");

        //#1 +
        String textResult = text1 + text2;
        System.out.println("Plus operator: " + textResult);

        //#2 var1.concat(var2)
        String textResult2 = text1.concat(text2);
        System.out.println("Concat: " + textResult2);

        //#3 Static Method join
        String text3 = "Third string";
        String text4 = " The final string";
        String textResult3 = String.join(", ", text1, text2, text3, text4);
        System.out.println("\n" + textResult3 + "\n");

        //if we add string + int or others the method toString works secretly
        Integer value1 = 10;
        Integer value2 = 20;
        System.out.println(value1 + value2 + " " + text); //30 + string
        System.out.println(text + " " + value1 + value2); //string + 1020

    }
}
