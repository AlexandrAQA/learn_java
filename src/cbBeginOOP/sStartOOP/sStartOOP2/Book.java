package cbBeginOOP.sStartOOP.sStartOOP2;

public class Book {
    private String name;
    private String author;
    private EnumBookGen genre;
    private int cost;

    public Book(String name, String author, EnumBookGen genre, int cost) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public EnumBookGen getGenre() {
        return genre;
    }

    public void setGenre(EnumBookGen genre) {
        this.genre = genre;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
