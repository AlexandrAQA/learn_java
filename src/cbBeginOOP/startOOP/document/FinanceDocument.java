package cbBeginOOP.startOOP.document;

import java.util.Date;

public class FinanceDocument extends Document{

    private int sum;
    private int code;

    public FinanceDocument(String name, Date date, int sum, int code) {
        super(name, date);
        this.sum  = sum;
        this.code = code;
    }

    public FinanceDocument(String name, Date date) {
        super(name, date);
    }

    @Override
    public void printDocumentInfo() {
        System.out.printf("Document name %s, \n document date %s, \n sum %d, \n code %d\n",
                this.name, this.date, this.sum, this.code);
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
