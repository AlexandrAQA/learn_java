package BeginOOP.StartOOP.document;

import java.util.Date;

public class EmployeeDocument extends Document{

    private Date startDate;
    private Date endDate;
    private String employeeName;


    public EmployeeDocument() {

    }
    public EmployeeDocument(String name, Date date, Date startDate, Date endDate, String employeeName) {
        super(name, date);
        this.startDate = startDate;
        this.endDate = endDate;
        this.employeeName = employeeName;
    }

    @Override
    public void printDocumentInfo() {
        System.out.printf("Document name %s, \n document date %s, \n start date %s,\n end Date %s,\n employee name %s\n",
                this.name, this.date, this.startDate, this.endDate, this.employeeName);
    }


    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
