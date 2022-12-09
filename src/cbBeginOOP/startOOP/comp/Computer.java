package cbBeginOOP.startOOP.comp;

public class Computer {
    private String name;
    private int cost;
    private RAM ram;
    private HDD hdd;

    @Override
    public String toString() {
        return "Computer info: " + "\n" +
                "name = " + name + ",\n" +
                "cost = " + cost + ",\n" +
                "ram name = " + ram.getRamName() + ",\n" +
                "ram volume = " + ram.getVolume() + "\n" +
                "hdd name = " + hdd.getHddName() + "\n" +
                "hdd volume = " + hdd.getVolume();
    }

    public Computer(String name, int cost) {
        this.name = name;
        this.cost = cost;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(String name, int cost, RAM ram, HDD hdd) {
        this.name = name;
        this.cost = cost;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }
}
