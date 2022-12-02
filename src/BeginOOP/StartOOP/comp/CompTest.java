package BeginOOP.StartOOP.comp;

public class CompTest {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Office Computer", 1000);
        System.out.println(computer1);

        System.out.println("=========================================");

        Computer computer2 = new Computer("Gaming computer", 2000,
                new RAM("Test","64"),
                new HDD("Toshiba", "2Tb", Type.EXTERNAL));
        System.out.println(computer2);
    }
}
