package cbBeginOOP.startOOP.comp;

public class HDD {
    private String hddName;
    private String volume;

    public HDD (){

    }

    public HDD(String hddName, String volume, Type type) {
        this.hddName = hddName;
        this.volume = volume;
        this.type = type;
    }

    public String getHddName() {
        return hddName;
    }

    public void setHddName(String hddName) {
        this.hddName = hddName;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    private Type type;



}
