package BeginOOP.StartOOP.comp;

public class RAM {
    private String ramName;
    private String volume;


    public RAM() {

    }


    public RAM(String ramName, String volume) {
        this.ramName = ramName;
        this.volume = volume;
    }


    public String getRamName() {
        return ramName;
    }

    public void setRamName(String ramName) {
        this.ramName = ramName;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
}
