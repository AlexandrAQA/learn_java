package cbBeginOOP.startOOP.Static;

public class Cat {
    public String name;
    public static int count;
    public int fakeCount;

    //static block
    static {

        count = 10;
    }

    public Cat(String name) {
        this.name = name;
        count++;
        fakeCount++;
        System.out.println("My name is " + name +
                ", cat's Count (static) = " + count + "\nfake count (not static) = " + fakeCount + "\n");
    }

    public static int getCount() {
        return count;
    }
}
