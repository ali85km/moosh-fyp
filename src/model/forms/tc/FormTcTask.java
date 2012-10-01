package model.forms.tc;

import java.util.Date;

public class FormTcTask {

    private String title;
    private Date assignDate;
    private Date dueDate;
    private Date endDate;

    public FormTcTask(String titleIn, Date assignDateIn, Date dueDateIn,
            Date endDateIn) {
        this.title = titleIn;
        this.assignDate = assignDateIn;
        this.dueDate = dueDateIn;
        this.endDate = endDateIn;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String titleIn) {
        this.title = titleIn;
    }

    public Date getAssignDate() {
        return this.assignDate;
    }

    public void setAssignDate(Date assignDateIn) {
        this.assignDate = assignDateIn;
    }

    public Date getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(Date dueDateIn) {
        this.dueDate = dueDateIn;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDateIn) {
        this.endDate = endDateIn;
    }
}
