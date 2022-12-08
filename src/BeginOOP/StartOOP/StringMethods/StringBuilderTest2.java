package BeginOOP.StartOOP.StringMethods;

public class StringBuilderTest2 {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("My string ");
        System.out.println(buffer);

        //there is a magic with several methods
        buffer.append(" test ").append("some text ").insert(3, "NEW ")
                            .reverse();
        System.out.println(buffer + "\n");

        //try to make an ordinal string again
        buffer.reverse().delete(3,7).deleteCharAt(9);
        System.out.println(buffer);


    }
}
