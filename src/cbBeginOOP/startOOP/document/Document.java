package cbBeginOOP.startOOP.document;

import java.util.Date;

public abstract class Document {
    protected String name;
    protected Date date;

    public Document () {

    }

    public Document(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public abstract void printDocumentInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
