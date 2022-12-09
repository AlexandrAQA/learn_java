package cbBeginOOP.startOOP.StringMethods;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("My string ");
        buffer.append(1);
        buffer.append(" test");

        System.out.println(buffer);

        //insert substring in our string
        buffer.insert(3, "new ");
        System.out.println(buffer);

        //reverse string
        buffer.reverse();
        System.out.println(buffer);


    }
}
