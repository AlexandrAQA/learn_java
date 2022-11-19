package BeginOOP.StartOOP.StartOOP2;

public class BookMain {

    public static void main(String[] args) {
        Book book1 = new Book("Java", "Smith", EnumBookGen.SCIENСE, 40);
        System.out.printf("book is %s and author is %s, genre is %s, cost is %s",
                book1.getName(), book1.getAuthor(), book1.getGenre(),book1.getCost());
    }
}