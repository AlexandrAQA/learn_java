package cbBeginOOP.startOOP.Static;

public class CatsMain {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Myrzik");
        //System.out.println("\nTotal amount of Cats now is = " + Cat.getCount() + "\n");

        Cat cat2 = new Cat("Mars");
        Cat cat3 = new Cat("Batman");
        Cat cat4 = new Cat("Belka");

        //out  is static variable with Method println
        System.out.println("\nTotal amount of Cats = " + Cat.getCount());
        //Math is also static
        //Math.sqrt(4);



    }
};

