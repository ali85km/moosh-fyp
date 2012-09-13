package model;

import java.util.Date;

public class Task {

    private int id;
    private String title;
    private Date assignDate;
    private Date dueDate;
    private Date endDate;

    public Task(int idIn, String titleIn, Date assignDateIn, Date dueDateIn,
            Date endDateIn) {
        this.id = idIn;
        this.title = titleIn;
        this.assignDate = assignDateIn;
        this.dueDate = dueDateIn;
        this.endDate = endDateIn;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int idIn) {
        this.id = idIn;
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
